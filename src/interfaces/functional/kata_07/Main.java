package interfaces.functional.kata_07;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse){
        return T -> condition.test(T) ? ifTrue.apply(T) : ifFalse.apply(T);
    }

    public static Predicate<Object> condition(){
        return Objects::isNull;
    }
    public static Function<Object, Integer> ifTrue(){
        return obj -> 0;
    }
    public static Function<CharSequence, Integer> ifFalse(){
        return CharSequence::length;
    }
}

