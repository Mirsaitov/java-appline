import java.util.Scanner;
public class Task13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строковый данные №1: ");
        String hi = input.nextLine();
        System.out.println("Введите строковый данные №2: ");
        String hi2 = input.nextLine();
            if(hi.length()==hi2.length()) {
System.out.println("Длина строки " + "'" + hi + "'" + "("+ hi.length() + ")"+ " = длине строки " + "'" + hi2 + "'" + "("+ hi2.length() + ")");
            }
            else if (hi.length() > hi2.length()) {
System.out.println("Длина строки " + "'" + hi + "'" + "(" + hi.length() + ")" + " больше, чем длина строки " + "'" + hi2 + "'" + "("+ hi2.length() + ")");
        }
            else if (hi2.length() > hi.length()) {
System.out.println("Длина строки "  + "'" + hi2 + "'" + "(" + hi2.length() + ")" + " больше, чем длина строки " + "'" + hi + "'" + "("+ hi.length() + ")");
        }
    }
}
