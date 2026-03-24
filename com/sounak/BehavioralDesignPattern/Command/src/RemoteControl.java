package com.sounak.BehavioralDesignPattern.Command.src;

public class RemoteControl {
    private Command command;
    private Command command2;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        command2 = command; // save for undo
    }

    public void pressUndo() {
        command2.undo(); // undo last command!
    }
}
