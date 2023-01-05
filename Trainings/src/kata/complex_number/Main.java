package kata.complex_number;

public class Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(2.3, 3.2);
        ComplexNumber complexNumber2 = new ComplexNumber(2.3, 3.2);

        System.out.println(complexNumber1.equals(complexNumber2));
    }
}
