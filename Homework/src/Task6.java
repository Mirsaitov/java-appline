import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = input.nextInt();
        System.out.print("Введите число y: ");
        int y = input.nextInt();
        System.out.print("Введите число z: ");
        int z = input.nextInt();
        int srsum = (x+y+z)/3;
        System.out.println("Среднее арифметическое число: " + srsum);

        int delenie = srsum/2;
        if(delenie > 3)
            System.out.println("Программа выполнена корректно");


    }
}
