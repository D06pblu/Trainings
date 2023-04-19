package kata.dimond;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X");
        int x = scanner.nextInt();

        System.out.println("Введите Y");
        int y = scanner.nextInt();
        Main.printDiamond(x, y);
    }

    public static void printDiamond(int x, int y) {
        int mid = x / 2; //Вычисляем середину ромба (координаты точки, где пересекаются диагонали)
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) { //Проходимся по каждой строке (от 0 до Y-1) и каждому символу в строке (от 0 до X-1).
                if (Math.abs(mid - j) + Math.abs(mid - i) <= mid) { //Если расстояние от текущей позиции до середины ромба по X и по Y меньше или равно половине ширины ромба
                    System.out.print("#"); //(т.е. мы находимся внутри ромба), то выводим символ "#"
                } else {
                    System.out.print(" "); //иначе - " "
                }
            }
            System.out.println();
        }
    }
}

