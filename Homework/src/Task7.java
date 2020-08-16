import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = 13;
        int y = 22;
        int z = 21;
        int number = input.nextInt();;
        if (number == x) {
            System.out.println("Данное значение имеется в константах");
        }
        else if(number == y) {
            System.out.println("Данное значение имеется в константах");
        }
        else if(number == z) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");

        }
    }
}

