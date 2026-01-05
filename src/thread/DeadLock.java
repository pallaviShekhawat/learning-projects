package thread;

class Resources {

}
public class DeadLock {
    public static void main (String[] args)
    {
        Resources r1 = new Resources();
        Resources r2 = new Resources();

        Thread t1 = new Thread(()->{
               synchronized (r1){
            System.out.println("Holding R1 and wating for r2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (r2){
                System.out.println("Demanding R2");
            }
    }
    });

    Thread t2 = new Thread(()->{
    synchronized (r1){
        System.out.println("Holding R2 and wating for r1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (r2){
            System.out.println("Demanding R1");
        }
    }
});
        t1.start();
        t2.start();
}
}