package kata;
import java.util.Locale;
import java.util.Scanner;

public class DoubleReader {
    public static void main(String[] args) {
        double poi = sum();
        System.out.printf("%f", poi);
    }
    public static double sum() {
        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(Locale.US);
        double result = 0.0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += Double.parseDouble(scanner.next());
            }
            else {
                scanner.next();
            }
        }
        return result;
    }
}


