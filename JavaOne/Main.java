//Кочин Максим 31.01.2026

package JavaOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lastResult = 0;
        int operationsCount = 0;

        while (true) {
            System.out.println("\n===== CALC MENU =====");
            System.out.println("1 - Сложение (+)");
            System.out.println("2 - Вычитание (-)");
            System.out.println("3 - Умножение (*)");
            System.out.println("4 - Деление (/)");
            System.out.println("5 - Остаток от деления (%)");
            System.out.println("6 - Степень (a^b)");
            System.out.println("7 - Среднее из N чисел");
            System.out.println("8 - Показать статистику");
            System.out.println("0 - Выход");
            System.out.println("=====================");
            System.out.print("Выберите пункт: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите номер пункта меню");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Выход из программы");
                break;
            }

            switch (choice) {

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6: {
                    double a = getNumber(scanner, "Введите первое число (или -1 для lastResult): ");
                    if (a == -1) {
                        a = lastResult;
                        System.out.println("Используется lastResult = " + lastResult);
                    }

                    double b = getNumber(scanner, "Введите второе число: ");

                    if ((choice == 4 || choice == 5) && b == 0) {
                        System.out.println("Ошибка: деление на 0 запрещено");
                        break;
                    }

                    double result = 0;

                    switch (choice) {
                        case 1:
                            result = a + b;
                            break;
                        case 2:
                            result = a - b;
                            break;
                        case 3:
                            result = a * b;
                            break;
                        case 4:
                            result = a / b;
                            break;
                        case 5:
                            result = a % b;
                            break;
                        case 6:
                            result = Math.pow(a, b);
                            break;
                    }

                    lastResult = result;
                    operationsCount++;

                    System.out.println("Результат: " + result);
                    break;
                }

                case 7: {
                    int n;

                    System.out.print("Введите количество чисел: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Ошибка: введите целое число");
                        scanner.next();
                        break;
                    }

                    n = scanner.nextInt();
                    if (n <= 0) {
                        System.out.println("Количество должно быть больше 0");
                        break;
                    }

                    double sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum += getNumber(scanner, "Введите число " + i + ": ");
                    }

                    double avg = sum / n;
                    lastResult = avg;
                    operationsCount++;

                    System.out.println("Среднее значение: " + avg);
                    break;
                }

                case 8:
                    System.out.println("Статистика: ");
                    System.out.println("Количество операций: " + operationsCount);
                    System.out.println("Последний результат: " + lastResult);
                    break;

                default:
                    System.out.println("Неверный пункт меню");
            }
        }

        scanner.close();
    }

    private static double getNumber(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите число");
            scanner.next();
            System.out.print(message);
        }
        return scanner.nextDouble();
    }
}
