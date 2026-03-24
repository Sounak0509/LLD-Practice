package com.sounak.BehavioralDesignPattern.Command.src;

public class FanOnCommand implements Command {

    private Fan fan;

    FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();
    }
}
