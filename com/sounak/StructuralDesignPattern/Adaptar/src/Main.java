package com.sounak.StructuralDesignPattern.Adaptar.src;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("song.mp3");
        player.play("movie.mp4");
        player.play("video.vlc");
        player.play("clip.avi");
    }
}
