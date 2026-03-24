package com.sounak.BehavioralDesignPattern.Template.src;


public abstract class Tea {

    final void makeTea() {
        System.out.println("Starting to making tea...");
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boil water...");
    }

    void pourInCup() {
        System.out.println("Pour in cup...");
    }

    abstract void brew();

    abstract void addCondiments();
}
