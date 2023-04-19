package serialization.simple.test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/*
можно сериализовать в 8 и десериализовать в 17 - никаих ошибок. В обратном порядке тоже

 */
public class ParentClass {
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private int i;
    public String string;

    public ParentClass(){ //если конструктор сделать private, то десериализация будет падать с ошибкой и будет ругаться на InvalidConstructor
    }

    public ParentClass(String string, int i){
        this.i=i;
        this.string=string;
    }
}

class ChildClass extends ParentClass implements Serializable {

    Map<String, Integer> map = new HashMap<>();

    public ChildClass(String string, int i) {
        super(string, i);
        map.put("Danila", 18);
    }

    public String toString(){
        return string + " - " + getI() + " и наша мэпа" + map.toString();
    }
}
