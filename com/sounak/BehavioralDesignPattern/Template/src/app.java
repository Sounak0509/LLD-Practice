package com.sounak.BehavioralDesignPattern.Template.src;

public class app {
    public static void main(String[] args) {
        Tea blackTea = new BlackTea();
        blackTea.makeTea();

        Tea milkTea = new MilkTea();
        milkTea.makeTea();
    }
}
