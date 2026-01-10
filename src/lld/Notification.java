package lld;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Notification {
    private String notificationId;
    private String userId;
    private String message;
    private int retryCount;
    private List<NotificationType> channels;

    public Notification(String notificationId ,String userId ,String message ,int retryCount ,List<NotificationType> channels ){
        this.notificationId = notificationId;
        this.userId =userId;
        this.message =message;
        this.retryCount =retryCount;
        this.channels =channels;
    }

    public String getNotificationId(){
        return notificationId;
    }
    public String getUserId(){
        return userId;
    }
    public String getMessage(){
        return message;
    }
    public int getRetryCount(){
        return retryCount;
    }
    public void incrementRetry(){
        this.retryCount++;
    }
    public List<NotificationType> getChannels(){
        return channels;
    }
}

 enum NotificationType {
    EMAIL,
    SMS,
    PUSH
}

interface NotificationChannel {
    boolean send(Notification notification);
}

class EmailChannel implements NotificationChannel {

    @Override
    public boolean send(Notification notification) {
        System.out.println("Sending Email To User " + notification.getUserId());
        return true ;
    }
}

class SmsChannel implements NotificationChannel {
    @Override
    public boolean send(Notification notification){
        System.out.println("Sending SMS to User " + notification.getUserId());
        return false;
    }
}
 class PushChannel implements NotificationChannel {
    @Override
    public boolean send(Notification notification){
        System.out.println("Sending Push Notification to User " +notification.getUserId());
        return true;
    }
}

class NotificationChannelFactory {
    public static NotificationChannel getChannel(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailChannel();
            case SMS:
                return new SmsChannel();
            case PUSH:
                return new PushChannel();
            default:
                throw new IllegalArgumentException("Invalid Channel type");
        }
    }
}

class RetryQueue{

    private static Queue<Notification> retryQueue = new LinkedList<>();

    public static void add(Notification notification){
        retryQueue.add(notification);
    }
    public static Notification poll(){
        return retryQueue.poll();
    }
    public static boolean isEmpty(){
        return retryQueue.isEmpty();
    }
}

 class NotificationService {

    private static final int MAX_RETRY =3;

    public void process(Notification notification ){
        for(NotificationType type : notification.getChannels()){
            NotificationChannel channel = NotificationChannelFactory.getChannel(type);

            boolean sent = channel.send(notification);
            if(sent) {
                System.out.println("Notification sent successfully via " + type);
                return;
            }
        }
        handleRetry(notification);
    }

    private void handleRetry(Notification notification) {
        if (notification.getRetryCount() <MAX_RETRY){
            notification.incrementRetry();
            System.out.println("Retrying Notification ,attempt :" +notification.getRetryCount());
            RetryQueue.add(notification);
        }
        else {
            System.out.println("Moved to DLQ :" +notification.getNotificationId());
        }
    }
}

class NotificationWorker implements Runnable {

    private NotificationService service = new NotificationService();
    @Override
    public void run() {
        while (true) {
            if (!RetryQueue.isEmpty()){
                Notification notification = RetryQueue.poll();
                service.process(notification);
            }
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class NotificationApp{
     public static void main(String[] args) {
         Notification notification = new Notification("P1" ,"PAL123","Payment Done",0,
                 Arrays.asList(NotificationType.EMAIL, NotificationType.SMS, NotificationType.PUSH));

         NotificationService service = new NotificationService();
         service.process(notification);

         Thread worker = new Thread(new NotificationWorker());
         worker.start();


     }
 }
