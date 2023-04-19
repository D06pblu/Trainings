package classes;

import java.util.Scanner;

class OneClasses {
    int i;
    private Object Book;
    Object tst = (OneClasses) Class.forName("classes.Book").newInstance();

    OneClasses() throws IllegalAccessException, ClassNotFoundException, InstantiationException, CloneNotSupportedException {
    }
    OneClasses oo = new OneClasses();
    Book book = (classes.Book) oo.clone();

}

class AnotherClass{
    String s;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пустую книгу");
        Book harreyPotter = new Book();
        System.out.println("Автор - "+ harreyPotter.author +", название - "+ harreyPotter.name+", год написания - "+harreyPotter.year);

        System.out.println("Введите заполненную книгу");
        Book hollyBible = new Book(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
        System.out.println("Автор - "+ hollyBible.author +", название - "+ hollyBible.name+", год написания - "+hollyBible.year);

        System.out.println();
    }
}

class Book extends AnotherClass {
    String name;
    String author;
    int year;

    public Book (String name, String author, int year){
        this.name=name;
        this.author=author;
        this.year=year;
    }
    public Book(){    }

}

