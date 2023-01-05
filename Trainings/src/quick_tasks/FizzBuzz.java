package quick_tasks;
/*
Перебрать числа от 1 до 100.
Распечатать Fizz для тех, которые делятся на 3 без остатка.
Распечатать Buzz для тех, что делятся на 5 без остатка.
Распечатать FizzBuzz для тех что делятся и на 3, и на 5 без остатка.
 */
public class FizzBuzz {
    static int fizz;
    static int buzz;
    static int fizzBuzz;

    public static void main(String[] args) {

        for (int i=1; i<=1000   ; i++){
            if (i%3==0 && i%5==0){
                fizzBuzz++;
                System.out.println("i="+i+" FizzBuzz");}
            else if (i%3==0){
                fizz++;
                System.out.println("i="+i+" Fizz");}
            else if (i%5==0){
                buzz++;
                System.out.println("i="+i+" Buzz");}
        }
        System.out.println("Total Fizz="+fizz);
        System.out.println("Total Buzz="+buzz);
        System.out.println("Total FizzBuzz="+fizzBuzz);
    }
}
