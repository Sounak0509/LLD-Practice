package com.sounak.StructuralDesignPattern.Decorator.src;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " + Sugar";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice()+ 5.0;
    }
}
