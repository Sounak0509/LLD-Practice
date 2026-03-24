package com.sounak.BehavioralDesignPattern.Template.src;

public class MilkTea extends Tea {
    @Override
    void brew() {
        System.out.println("Milk Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Milk Tea add Condiments");
    }
}
