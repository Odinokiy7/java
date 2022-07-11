//Написать метод, который будет эмулировать работу динамического массива

import java.util.Arrays;
import java.util.Scanner;

public class task_2_sem_2 {
    public static void main(String[] args) {
        int[] array = new int[0];
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result = (i * (i + 1)) / 2;
                array = arrayAppend(array, result);
                System.out.println(Arrays.toString(array));

            }
            System.out.println();
        }
        sc.close();

    }

    public static int[] arrayAppend(int[] array, int nextTriangularNumber) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = nextTriangularNumber;
        return newArray;
    }
}