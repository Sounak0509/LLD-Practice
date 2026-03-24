package com.sounak.StructuralDesignPattern.Adaptar.src;

public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String filename) {
        //do nothing
    }

    @Override
    public void playVLC(String filename) {
        System.out.println("VLC playing " + filename);
    }
}
