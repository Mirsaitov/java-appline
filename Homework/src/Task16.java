import java.io.*;
import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите путь к файлу: ");
        String i  = input.nextLine();;
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader(i))){
        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
