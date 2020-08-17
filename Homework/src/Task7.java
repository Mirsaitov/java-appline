import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        final int X = 13;
        final int Y = 22;
        final int Z = 21;
        int number = input.nextInt();;
        if (number == X) {
            System.out.println("Данное значение имеется в константах");
        }
        else if(number == Y) {
            System.out.println("Данное значение имеется в константах");
        }
        else if(number == Z) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");

        }
    }
}

