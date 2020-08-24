import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите путь к файлу .txt: ");
        String i = input.nextLine();
        String s = null;
        int linesCount = 0;
        try (LineNumberReader br = new LineNumberReader(new FileReader(i))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                 {linesCount++;}
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        System.out.println("Koличecтвo cтpok в фaйлe: " + linesCount);
    }
}
