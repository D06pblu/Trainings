package gof_pattrens.behavioral.command;

public class Client {           //client
    public static void main(String[] args) {
        Light light = new Light();
        Switcher switcher = new Switcher(new TurnOnLightCommand(light), new TurnOffLightCommand(light));

        System.out.println("в комнате темно. Включим свет.");
        switcher.turnON();

        System.out.println("Теперь слишком светло, выключим.");
        switcher.turnOFF();
    }
}
