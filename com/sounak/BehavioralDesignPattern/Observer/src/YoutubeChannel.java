package Observer.src;

import java.util.ArrayList;

public class YoutubeChannel implements Subject {

    public ArrayList<Observer> subscribers = new ArrayList<>();
    public String channelName;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer o) {
        subscribers.add(o);
        System.out.println("Subscriber " + o.toString() + " subscribed to " + channelName);
    }

    @Override
    public void unsubscribe(Observer o) {
        subscribers.remove(o);
        System.out.println("Subscriber " + o.toString() + " unsubscribed to " + channelName);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.update(videoTitle);  // notify each subscriber
        }
    }

    public void uploadVideo(String title) {
        System.out.println(channelName + " uploaded: " + title);
        notifyObservers(title);  // automatically notify all!
    }
}
