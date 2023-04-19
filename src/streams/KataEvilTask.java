package streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KataEvilTask {
    public static void main(String[] args) {
        BufferedReader lines = new BufferedReader(new InputStreamReader(System.in));
//        Stream<String> lines = Stream.of("here we provide one long string");
        lines.lines().flatMap(x -> Stream.of(x.split(" ")))     // разделяем стрингу на составляющие и выдаем из этого стрим
                .map(x -> x.replaceAll("\\p{Punct}", ""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())))
                .sorted((a, b) -> (int) (b.getValue() - a.getValue()))
                .limit(10)
                .forEach(System.out::println);

    }
}
