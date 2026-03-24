package com.sounak.BehavioralDesignPattern.Command.src;
public class Main {
    public static void main(String[] args) {
        // Create receivers
        Light light = new Light();
        Fan fan = new Fan();

        // Create commands
        Command lightOn = new LightOnCommand(light);
        Command fanOn = new FanOnCommand(fan);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Execute light command
        remote.setCommand(lightOn);
        remote.pressButton();  // Light is ON
        remote.pressUndo();    // Light is OFF

        System.out.println("---");

        // Execute fan command
        remote.setCommand(fanOn);
        remote.pressButton();  // Fan is ON
        remote.pressUndo();    // Fan is OFF
    }
}
