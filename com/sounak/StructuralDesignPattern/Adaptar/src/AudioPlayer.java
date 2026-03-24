package com.sounak.StructuralDesignPattern.Adaptar.src;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter adapter;

    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp3")) {
            System.out.println("Playing MP3 file: " + filename);
        } else if (filename.endsWith(".mp4") || filename.endsWith(".vlc")) {
            // Use adapter for incompatible formats!
            adapter = new MediaAdapter(filename.endsWith(".mp4") ? "mp4" : "vlc");
            adapter.play(filename);
        } else {
            System.out.println("Format not supported!");
        }
    }
}
