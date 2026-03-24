package com.sounak.StructuralDesignPattern.Decorator.src;

public class BaseCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic coffee";
    }

    @Override
    public double getPrice() {
        return 50.0;
    }
}
