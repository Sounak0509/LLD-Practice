package com.sounak.StructuralDesignPattern.Adaptar.src;

public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }

    @Override
    public void playVLC(String filename) {
        //do nothing
    }
}
