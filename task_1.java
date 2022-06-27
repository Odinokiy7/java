public class task_1 {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 1; i < count; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}