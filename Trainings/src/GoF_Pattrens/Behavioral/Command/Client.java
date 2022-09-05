package GoF_Pattrens.Behavioral.Command;

public class Client {           //client
    public static void main(String[] args) {
        Light light = new Light();
        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(light);

        Switcher switcher = new Switcher(turnOnLightCommand, turnOffLightCommand);

        System.out.println("в комнате темно. Включим свет.");
        switcher.turnON();

        System.out.println("Теперь слишком светло, выключим.");
        switcher.turnOFF();
    }
}
