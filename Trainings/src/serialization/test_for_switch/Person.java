package serialization.test_for_switch;

import java.io.Serializable;
/*
эксперимент заключается в том что мы написали сначала в java 17 с ее синтаксисом в case\switch
а десериализовали в java 8 с ее синтаксисом, и никакой ошибки не получили. Кстати еще @Serial пришлось удалить.
Отсюда делаем вывод что внутренние изменения в классе, если они не меняют поля и конструктор по умолчанию,
никак не влияют на возможность сериализации\десериализации.
 */

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    public Person() {
        int i = (int) (Math.random() * 5);
        switch (i) {
//            case 0 -> name = "Vasya";
//            case 1 -> name = "Dima";
//            case 2 -> name = "Sergey";
//            case 3 -> name = "Anton";
//            case 4 -> name = "Igor";

            case 0:
                name = "Vasya";
                break;
            case 1:
                name = "Dima";
                break;
            case 2:
                name = "Sergey";
                break;
            case 3:
                name = "Anton";
                break;
            case 4:
                name = "Igor";
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
