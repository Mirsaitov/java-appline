import java.io.*;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите путь к файлу .txt: ");
        String i  = input.nextLine();
        String x = ".txt";
        try {

            String b = i.substring(i.length() - 4);
            boolean a = b != x;



            } catch (IOException exc)  {
            System.out.println("Неверный формат файла .txt: " + exc );
        }



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
