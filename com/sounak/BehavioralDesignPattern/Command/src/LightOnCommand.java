package com.sounak.BehavioralDesignPattern.Command.src;

public class LightOnCommand implements Command {

    Light light;

    LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
