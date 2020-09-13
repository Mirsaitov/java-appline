import java.io.*;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите путь к файлу .txt: ");
        String i = input.nextLine();
        String s;
        int linesCount = 0;

        try (LineNumberReader br = new LineNumberReader(new FileReader(i))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                {
                    linesCount++;
                }       //для подсчета строк
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        System.out.println("\r\n" + "Koличecтвo cтpoк в фaйлe: " + linesCount);

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter(i)) {
            for (int t = 0; t < linesCount; ++t) {
                str = br.readLine();
                str = str + "\r\n";
                fw.write(str);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}