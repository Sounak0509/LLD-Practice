package com.sounak.StructuralDesignPattern.Adaptar.src;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer mediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equals("mp4")) {
            mediaPlayer = new MP4Player();
        } else if (audioType.equals("vlc")) {
            mediaPlayer = new VLCPlayer();
        }
    }

    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp4")) {
            mediaPlayer.playMP4(filename);
        } else if (filename.endsWith(".vlc")) {
            mediaPlayer.playVLC(filename);
        }
    }
}
