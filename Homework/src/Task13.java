import java.util.Scanner;
public class Task13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строковый данные №1: ");
        String hi = input.nextLine();
        System.out.println("Введите строковый данные №2: ");
        String hi2 = input.nextLine();
            if(hi.length()==hi2.length()) {
System.out.println("Обе строки равны");
            }
            else if (hi.length() > hi2.length()) {
System.out.println("Строка с наибольшей длиной: " + hi);
        }
            else  {
System.out.println("Строка с наибольшей длиной: "+hi2);
        }
    }
}
