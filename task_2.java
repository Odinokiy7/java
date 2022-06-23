import java.util.Random;
public class task_2 {
    public static void main(String[] args) {
        int s = 246; // Наше число
        Random random = new Random();
        int i = random.nextInt(1, 10);          // Рандомное число, на которое будем делить для проверки
        System.out.println("Дано число: " + i);
        int number1 = s / 100;                                // Получаем первую цифру нашего числа
        int number2 = s % 100 / 10;                           // Получаем вторую цифру нашего числа
        int number3 = s % 10;                                 // Получаем третью цифру нашего числа
        int resultNum = number1 + number2 + number3;          // Сумма цифр из нашего числа
        if (resultNum % i == 0) {
            System.out.println("Данное число делится без остатка на " + resultNum);
        } else {
            System.out.println("Данное число не делится без остатка на " + resultNum);
        }
    }
}