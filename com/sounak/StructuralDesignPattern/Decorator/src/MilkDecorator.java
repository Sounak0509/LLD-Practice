package com.sounak.StructuralDesignPattern.Decorator.src;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 10.0;
    }
}
