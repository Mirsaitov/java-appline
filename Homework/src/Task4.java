import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        int a = input.nextInt();
        int b = Integer.parseInt(String.valueOf(a),2);
        System.out.println("Десятичный формат: " + b);
 }
}
