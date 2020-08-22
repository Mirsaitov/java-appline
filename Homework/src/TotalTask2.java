import java.util.Scanner;

public class TotalTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        int nums[] = new int[size];
        for (int a = 0; a < size; a++) {
            System.out.println("Введите данные массива" + " №" + (a+1) + ": ");
            nums[a] = input.nextInt(); }      //задаем размер массива и наполнять его числами
                                              //использую сортировку выбором
            for (int min = 0; min < size; min++) {
                int least = min;               //находим номер минимального значения в текущем списке
                for (int j = min + 1; j < size; j++) {
                    if (nums[j] < nums[least]) {
                        least = j;} }         //производим обмен этого значения со значением первой неотсортированной позиции
                int tmp = nums[min];
                nums[min] = nums[least];
                nums[least] = tmp;            //сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
            }
        for (int q = 0; q < size; q++)
            System.out.println(nums[q]);
        }
    }


