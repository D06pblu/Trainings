package gof_pattrens.behavioral.command;

public class TurnOnLightCommand implements Command{         //command
    private Light theLight;

    public TurnOnLightCommand(Light light){
        this.theLight=light;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}
