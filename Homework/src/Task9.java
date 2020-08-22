import java.util.Scanner;
public class Task9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

                System.out.print("Шаг 1: " + "\n" + "Введите размер массива: ");

        int size = input.nextInt();
        int nums[] = new int[size];

            System.out.println("Шаг 2: " + "\n" +"Введите данные массива №1: ");

        for (int i = 0; i < size; i++) {
                    nums[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
                    System.out.println("Введите данные массива" + " №" + (i+2) + ": ");
        }

            System.out.println("Шаг 3: " + "\n" + "Умножаем каждый елемент массива на 2: ");
        for(int i = 0; i<nums.length; i++)
                {
           System.out.println(nums[i] + "*2=" + nums[i]*2);
        }
    }
}
