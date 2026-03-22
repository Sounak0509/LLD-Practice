package Observer.src;

public class Subscribers implements Observer {
    private final String name;

    public Subscribers(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " got notified → New video: " + videoTitle);
    }
}
