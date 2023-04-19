package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов,
 * и в конце выводящую 10 наиболее часто встречающихся слов.
 * Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр.
 * Например, в строке "Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".
 * Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово.
 * Выводите слова в нижнем регистре.
 * Если в тексте меньше 10 уникальных слов, то выводите сколько есть.
 * Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте,
 * то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке
 */


public class KataEvilSelfMade {
    public static void main(String[] args) {
        System.out.println(stringRepeatsCounter(splitIncomingString("Мама мыла-мыла-мылом-90")));
    }
    public static List<String> splitIncomingString(String string) {
        Stream<String> stringStream = Stream.of(string);
        List<String> results = stringStream.flatMap(x -> Stream.of(x.split("(?U)[^\\p{L}\\p{Digit}]+")))
                .collect(Collectors.toList());
        return results;
    }

    public static Map<String, Long> stringRepeatsCounter(List<String> strings) {
        Map<String, Long> mapa = strings.stream()
                .map(x -> x.toLowerCase())
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())))
                .collect(Collectors.toMap(key ->  key.getKey(), value -> value.getValue()));

        return mapa;
    }
}
