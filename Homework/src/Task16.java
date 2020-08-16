import java.util.Scanner; // Scanner из пакета java.util
public class Task16 {
    public static void main(String[] args) {
        // Создаём объект Scanner
        Scanner input = new Scanner(System.in);
        // Запрос пользователю на ввод радиуса
        System.out.print("Введите радиус: ");
        double radius = input.nextDouble();
        // Вычисление площади
        double area = radius * radius * 3.14159;
        // Отображение результата
        System.out.println("Площадь круга радиусом "
                + radius + " равна " + area);
    }
}
