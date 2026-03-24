package com.sounak.StructuralDesignPattern.Decorator.src;

public class Main {
    public static void main(String[] args) {
        // Basic coffee
        Coffee coffee = new BaseCoffee();
        System.out.println(coffee.getDescription() + " → ₹" + coffee.getPrice());

        // Add milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " → ₹" + coffee.getPrice());

        // Add sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " → ₹" + coffee.getPrice());

    }
}
