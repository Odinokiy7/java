import java.util.Scanner;

public class task_1_sem_2 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 9: ");
        int valueToFind = sc.nextInt();
        sc.close();

        System.out.println("Индекс числа " + valueToFind + " = " + binarySearch(values, valueToFind, 0, values.length - 1));
    }

    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
        int index = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }

}