import java.util.Scanner;
public class Task12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строковый данные: ");
        String hi = input.nextLine();
        String hi2 = hi.replaceAll(" ", "");

        System.out.println("Результат без пробелов: " + hi2);

    }
}