package Observer.src;

public class App {

    public static void main(String[] args) {
        // Create channel
        YoutubeChannel channel = new YoutubeChannel("TechWithTim");

        // Create subscribers
        Subscribers s1 = new Subscribers("Alice");
        Subscribers s2 = new Subscribers("Bob");
        Subscribers s3 = new Subscribers("Charlie");

        // Subscribe
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        // Upload video → all get notified automatically!
        channel.uploadVideo("Design Patterns in Java");

        System.out.println("---");

        // Bob unsubscribes
        channel.unsubscribe(s2);

        // Upload again → only Alice and Charlie notified
        channel.uploadVideo("Sliding Window Explained");
    }
}
