package GoF_Pattrens.Behavioral.Command;

public class Light {        //reciever
    public Light(){  }

    public void turnOn(){
        System.out.println("The light is on");
    }

    public void turnOff(){
        System.out.println("The light is off");
    }
}
