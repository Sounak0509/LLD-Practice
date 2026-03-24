package com.sounak.StructuralDesignPattern.Decorator.src;

public abstract class CoffeeDecorator implements Coffee {

    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}
