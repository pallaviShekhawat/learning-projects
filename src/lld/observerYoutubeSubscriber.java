package lld;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

//Observer Design Pattern is a behavioral pattern that establishes a one-to-many dependency between objects. When the subject changes its state, all its observers are automatically notified and updated.
//Jab Subject ka state change hota hai, to wo automatically sab Observers ko notify kar deta hai

interface ObserverYoutubeSubscriber {
    void update(String videoTitle);
}

interface Channel {
    void subscribe(ObserverYoutubeSubscriber s);
    void unsubscribe(ObserverYoutubeSubscriber s);
    void notifySubscribers();
}


class YouTubeChannel implements Channel {

    private List<ObserverYoutubeSubscriber> subscribers = new ArrayList<>();
    private String videoTitle;

    public void uploadVideo(String title) {
        this.videoTitle = title;
        notifySubscribers();
    }

    public void subscribe(ObserverYoutubeSubscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(ObserverYoutubeSubscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers() {
        for (ObserverYoutubeSubscriber s : subscribers) {
            s.update(videoTitle);
        }
    }
}

class User implements ObserverYoutubeSubscriber {

    private String name;

    User(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println(name + " got notification: New video uploaded - " + videoTitle);
    }
}

class ObserverTest {
    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        ObserverYoutubeSubscriber user1 = new User("Pallavi");
        ObserverYoutubeSubscriber user2 = new User("Shekhawat");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo("Observer Design Pattern in Java");
    }
}