import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        int nums[] = new int[size];
        for (int a = 0; a < size; a++) {
            System.out.println("Введите данные массива" + " №" + (i+1) + ": ");
            nums[a] = input.nextInt();
        }
          for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        for (int q = 0; q < size; q++)
        System.out.println(nums[q]);
    }
}
