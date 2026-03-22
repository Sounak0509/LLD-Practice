package Observer.src;

// Publisher Interface: Every publisher must have these 3 methods
public interface Subject {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers(String videoTitle);
}
