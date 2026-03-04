package four;

import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        // 1
        // multiplicationTable();
        // rectangle(4, 6);
        // triangle();
        // count();
        // sum100();

        // 2
        int[][] matrix = createMatrix3x3();
        printMatrix(matrix);
        sumMatrix(matrix);
        maxElement(matrix);
        countEvenInMatrix(matrix);
        sumRows(matrix);
        sumColumns(matrix);
        mainDiagonal(matrix);
        transposeMatrix(matrix);

        // 3
        int[][] randomMatrix = randomMatrix5x5();
        minElementWithPosition(randomMatrix);
        checkSymmetry(matrix);
        swapFirstLastRows(randomMatrix);
        zeroLessThanAverage(randomMatrix);
    }

    // Часть 1
    // static void multiplicationTable() {
    //     System.out.println("1. Таблица умножения:");
    //     for (int i = 1; i <= 10; i++) {
    //         for (int j = 1; j <= 10; j++) {
    //             System.out.print((i * j) + "\t");
    //         }
    //         System.out.println();
    //     }
    // }
    // // 2
    // static void rectangle(int n, int m) {
    //     System.out.println("\n2. Прямоугольник:");
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    // // 3
    // static void triangle() {
    //     System.out.println("\n3. Треугольник:");
    //     for (int i = 1; i <= 5; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // // 4
    //     static void count() {
    //     System.out.println("\n4. Количество чётных (1-100):");
    //     int count = 0;

    //     for (int i = 1; i <= 100; i += 10) {
    //         for (int j = i; j < i + 10 && j <= 100; j++) {
    //             if (j % 2 == 0) count++;
    //         }
    //     }

    //     System.out.println("Чётных: " + count);
    // }
    // // 5
    // static void sum100() {
    //     System.out.println("\n5. Сумма 1-100:");
    //     int sum = 0;

    //     for (int i = 1; i <= 10; i++) {
    //         for (int j = 1; j <= 10; j++) {
    //             sum += (i - 1) * 10 + j;
    //         }
    //     }

    //     System.out.println("Сумма: " + sum);
    // }

    // Часть 2
    // 1
        static int[][] createMatrix3x3() {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        return matrix;
    }
        static void printMatrix(int[][] matrix) {
        System.out.println("\n6. Матрица 3x3:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
        // 2
         static void sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                sum += matrix[i][j];

        System.out.println("7. Сумма элементов: " + sum);
    }
        // 3
    static void maxElement(int[][] matrix) {
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] > max)
                    max = matrix[i][j];

        System.out.println("8. Максимальный элемент: " + max);
    }
        // 4
    static void countEvenInMatrix(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] % 2 == 0)
                    count++;

        System.out.println("9. Чётных элементов: " + count);
    }
        // 5
    static void sumRows(int[][] matrix) {
        System.out.println("10. Сумма по строкам:");
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++)
                sum += matrix[i][j];
            System.out.println("Строка " + i + ": " + sum);
        }
    }
        // 6
    static void sumColumns(int[][] matrix) {
        System.out.println("11. Сумма по столбцам:");
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++)
                sum += matrix[i][j];
            System.out.println("Столбец " + j + ": " + sum);
        }
    }
            // 7    
    static void mainDiagonal(int[][] matrix) {
        System.out.println("12. Главная диагональ:");
        for (int i = 0; i < matrix.length; i++)
            System.out.print(matrix[i][i] + " ");
        System.out.println();
    }
            // 8
    static void transposeMatrix(int[][] matrix) {
        System.out.println("13. Транспонированная матрица:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }


            // Часть 3

            static int[][] randomMatrix5x5() {
        System.out.println("\n14. Случайная матрица 5x5:");
        Random rand = new Random();
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                matrix[i][j] = rand.nextInt(50) + 1;

        printMatrix(matrix);
        return matrix;
    }

    static void minElementWithPosition(int[][] matrix) {
        int min = matrix[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    row = i;
                    col = j;
                }

        System.out.println("15. Минимум: " + min + " (строка " + row + ", столбец " + col + ")");
    }

    static void checkSymmetry(int[][] matrix) {
        boolean symmetric = true;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                if (matrix[i][j] != matrix[j][i])
                    symmetric = false;

        System.out.println("16. Симметрична: " + symmetric);
    }

    static void swapFirstLastRows(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[matrix.length - 1][j];
            matrix[matrix.length - 1][j] = temp;
        }
        System.out.println("17. Первая и последняя строки поменяны местами.");
    }

    static void zeroLessThanAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }

        double avg = (double) sum / count;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] < avg)
                    matrix[i][j] = 0;

        System.out.println("18. Элементы меньше среднего обнулены.");
    }

}
