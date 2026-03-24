package com.sounak.StructuralDesignPattern.Facade.src;

public class HomeTheatreFacade {
    private final Lights lights;
    private final Projector projector;
    private final SoundSystem soundSystem;
    private final DVDPlayer dvdPlayer;

    HomeTheatreFacade() {
        lights = new Lights();
        projector = new Projector();
        soundSystem = new SoundSystem();
        dvdPlayer = new DVDPlayer();
    }

    public void watchMovie(String movie) {
        System.out.println("--- Setting up movie ---");
        lights.dim(10);
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(8);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        System.out.println("--- Enjoy your movie! ---");
    }

    public void endMovie() {
        System.out.println("--- Shutting down ---");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        lights.on();
        System.out.println("--- Goodbye! ---");
    }
}
