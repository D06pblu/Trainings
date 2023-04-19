package alfa4i;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exmpl {
    public static void main(String[] args) {
    Stream.of(46, 34, 24, 93, 91, 1, 34, 94)
            .filter(x -> x>40)                      //отфильтровать (больше 40)
            .map(x -> x+5)                          //изменить (увеличить на 5)
            .limit(2)                       //оставить только нужное количество (2)
            .forEach(System.out::println);          //распечатать

        System.out.println("*****************");

    Stream.of(2, 3, 0, 1, 3)
            .flatMapToInt(x -> IntStream.range(0, x))
            .forEach(System.out::print);

}}

