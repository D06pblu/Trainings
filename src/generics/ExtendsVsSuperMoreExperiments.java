package generics;

import java.util.ArrayList;
import java.util.List;

public class ExtendsVsSuperMoreExperiments {
    public void method(){
        // Так нельзя
        //      List<? extends Number> genericListNumbers = new ArrayList<>();
        //      genericListNumbers.add(1.3);
        //      genericListNumbers.add(1);
        //      genericListNumbers.add((int) 1);
        //      genericListNumbers.add((Integer) 1);
        //      genericListNumbers.add((double) 1);
        //      genericListNumbers.add((Double) 1.0);

        // и Так нельзя
        //      List<? extends Double> genericListNumbers = new ArrayList<>();
        //      genericListNumbers.add(1.3);
        //      genericListNumbers.add(1);
        //      genericListNumbers.add((int) 1);
        //      genericListNumbers.add((Integer) 1);
        //      genericListNumbers.add((double) 1);
        //      genericListNumbers.add((Double) 1.0);

        // и даже так нельзя...
        //      List<? extends Double> concreteListNumbers1 = new ArrayList<>();
        //      concreteListNumbers1.add(1.3);
        //      concreteListNumbers1.add(1);
        //      concreteListNumbers1.add((int) 1);
        //      concreteListNumbers1.add((Integer) 1);
        //      concreteListNumbers1.add((double) 1);
        //      concreteListNumbers1.add((Double) 1.0);
        //      List<? super Number> genericListNumbers2 = concreteListNumbers1;

        // Можно так:
        List<Number> concreteListNumbers = new ArrayList<>();
        concreteListNumbers.add(1.3);
        concreteListNumbers.add(1);
        concreteListNumbers.add((int) 1);
        concreteListNumbers.add((Integer) 1);
        concreteListNumbers.add((double) 1);
        concreteListNumbers.add((Double) 1.0);
        List<? super Number> genericListNumbers = concreteListNumbers; // можно ограничивать типы которые могут быть присвоены по ссылке

        // или так
        List<Integer> list = new ArrayList<>();
        List<? extends Number> numbers = list;

    }
}
