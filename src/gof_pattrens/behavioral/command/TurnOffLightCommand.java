package gof_pattrens.behavioral.command;

public class TurnOffLightCommand implements Command{        //command
    private Light theLight;

    public TurnOffLightCommand(Light light){
        this.theLight=light;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}
