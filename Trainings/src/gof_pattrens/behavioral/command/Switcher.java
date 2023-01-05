package gof_pattrens.behavioral.command;

public class Switcher {         //invoker
    private Command turnOnCommand;
    private Command turnOffCommand;

    public Switcher(Command turnOnCommand, Command turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    public void turnON(){
        turnOnCommand.execute();
    }

    public void turnOFF(){
        turnOffCommand.execute();
    }
}
