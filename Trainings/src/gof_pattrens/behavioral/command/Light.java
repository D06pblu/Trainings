package gof_pattrens.behavioral.command;

public class Light {        //reciever
    public Light(){  }

    public void turnOn(){
        System.out.println("The light is on");
    }

    public void turnOff(){
        System.out.println("The light is off");
    }
}
