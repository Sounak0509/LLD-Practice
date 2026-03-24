package com.sounak.StructuralDesignPattern.Facade.src;

public class Main {
    public static void main(String[] args) {
        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade();
        homeTheatreFacade.watchMovie("Dhurandhar");
        System.out.println("...");
        homeTheatreFacade.endMovie();
    }
}
