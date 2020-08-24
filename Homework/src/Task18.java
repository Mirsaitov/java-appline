import java.io.*;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите путь к файлу .txt: ");
        String i  = input.nextLine();
        String s;
        int linesCount = 0;

        try (LineNumberReader br = new LineNumberReader(new FileReader(i))){
            while((s = br.readLine()) != null) {
                System.out.println(s);
                {linesCount++;}       //для подсчета строк
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        System.out.println("\r\n" + "Koличecтвo cтpoк в фaйлe: " + linesCount);
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop'");
        try (FileWriter fw = new FileWriter(i)){
            do {
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            }
            while (str.compareTo("stop") != 0);
        } catch(IOException exc) {}
    }
}