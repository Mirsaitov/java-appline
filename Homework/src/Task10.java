import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Шаг 1: " + "\n" + "Введите количество строк массива: ");
        int size = input.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int size2 = input.nextInt();
        int nums[][] = new int[size][size2];




        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print("Введите элемент массива[" + i + "][" + j + "]:");
                nums[i][j] = input.nextInt();


                }

            }


        }
    }

