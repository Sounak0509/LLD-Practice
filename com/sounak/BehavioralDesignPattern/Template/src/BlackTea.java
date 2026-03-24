package com.sounak.BehavioralDesignPattern.Template.src;

public class BlackTea extends Tea {
    @Override
    void brew() {
        System.out.println("Black Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Black Tea add Condiments");
    }
}
