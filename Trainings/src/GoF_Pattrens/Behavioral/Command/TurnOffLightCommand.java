package GoF_Pattrens.Behavioral.Command;

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
