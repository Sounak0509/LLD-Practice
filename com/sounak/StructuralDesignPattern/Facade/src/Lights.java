package com.sounak.StructuralDesignPattern.Facade.src;

public class Lights {
    public void dim(int level) {
        System.out.println("Lights dimmed to " + level + "%");
    }
    public void on() {
        System.out.println("Lights on!");
    }
}
