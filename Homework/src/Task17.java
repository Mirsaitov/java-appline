import java.io.*;
import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Придумайте название файла с расширением .txt: ");
        String inp  = input.nextLine();
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Признак конца ввода - строка 'stop'");
        try (FileWriter fw = new FileWriter(inp)){
            do {
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch(IOException exc) {

        }
    }
}
