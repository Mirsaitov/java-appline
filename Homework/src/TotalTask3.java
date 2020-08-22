import java.util.Scanner;

public class TotalTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Курс доллара = ");
        double a = input.nextDouble();
        System.out.print("Количество рублей: ");
        double b = input.nextDouble();
        double value = b/a;
        String Result = String.format("%.2f",value);
        System.out.print("Итого: " + Result + " долларов");
    }
}