package generics;

import java.util.Arrays;
import java.util.List;

public class Invariant {
    List<Integer> ints = Arrays.asList(1,2,3);
//    List<Number> nums = ints; // compile-time error. Проблема обнаружилась на этапе компиляции
//    nums.set(2, 3.14);
//    assert ints.toString().equals("[1, 2, 3.14]");
}

/*
Если взять список целых чисел, то он не будет являться ни подтипом типа Number, ни каким-либо другим подтипом.
Он является только подтипом самого себя. То есть List <Integer> — это List<Integer> и ничего больше.
Компилятор позаботится о том, чтобы переменная ints, объявленная как список объектов класса Integer,
содержала только объекты класса Integer и ничего кроме них. На этапе компиляции производится проверка,
и у нас в рантайме уже ничего не упадет.
 */