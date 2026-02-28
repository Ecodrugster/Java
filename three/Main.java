package three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Введи элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 1
        // System.out.println("\n1) В обратном порядке:");
        // for (int i = n - 1; i >= 0; i--) {
        //     System.out.print(arr[i] + " ");
        // }

        // 2
        // int zeroCount = 0;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == 0) {
        //         zeroCount++;
        //     }
        // }
        // System.out.println("\n\n2) Количество нулей: " + zeroCount);

        // 3
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        //     sum += arr[i];
        // }
        // System.out.println("3) Сумма элементов: " + sum);

        // 4
        // int max = arr[0];
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        // System.out.println("4) Максимальный элемент: " + max);

        // 5
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 10) {
                found = true;
                break;
            }
        }

        System.out.println("5) Есть ли число 10: " + (found ? "YES" : "NO"));

        scanner.close();
    }
}
