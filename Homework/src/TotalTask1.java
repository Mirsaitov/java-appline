import java.util.Scanner;
public class TotalTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String str = input.nextLine();
        int sum = 0;
        for (int i = str.length() - 1, y = 1; i >= 0; i--, y = y * 2) {
            sum = sum + (str.charAt(i) - '0') * y;
        }
        System.out.println("Десятичный формат: " + sum);
    }
}
