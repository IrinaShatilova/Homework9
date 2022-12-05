import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Homework 9");
        // Задание 1
        int sum = 0;
        for (int number: arr) {
            sum += number;
        }
        System.out.println("Задание 1. Сумма затрат в месяц составила " + sum + " руб.");
        // Задание 2
        Arrays.sort(arr);
        System.out.printf("Задание 2. Минимальная сумма трат за месяц составила %d руб. Максимальная сумма трат за месяц составила %d руб.\n", arr[0],arr[arr.length-1]);
        // Задание 3
        System.out.printf("Задание 3. Средняя сумма трат в месяц составила %.2f руб.\n", (double)sum/ arr.length);
        char[] reverseFullName = {'ч','и','в','о','н','а','в','И',' ','н','а','в','И',' ','в','о','н','а','в','И'};
        System.out.print("Задание 4. ");
        for (int i=reverseFullName.length-1; i>=0; i--) {
        System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}