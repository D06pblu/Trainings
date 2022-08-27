package Serialization;

import java.io.Serializable;

public class ParentClass {
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private int i;
    public String string;

    private ParentClass(){
    }

    public ParentClass(String string, int i){
        this.i=i;
        this.string=string;
    }
}

class ChildClass extends ParentClass implements Serializable {

    public ChildClass(String string, int i) {
        super(string, i);
    }

    public String toString(){
        return string + " - " + getI();
    }
}
