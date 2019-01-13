import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args){
        final int X = 5;
        final int Y = 8;
        final int Z = 12;
        System.out.println("Введи переменную T: ");
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        if (T==X||T==Y||T==Z) {
            System.out.print("Данное значение имеется в константах:");
        } else {
            System.out.print("Такой константы нет!");
        }

        if (T==X){
            System.out.print(" X");
        }

        if (T==Y){
            System.out.print(" Y");
        }

        if (T==Z){
            System.out.print(" Z");
        }
    }
}