package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== МЕНЮ =====");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Показать все книги");
            System.out.println("3. Найти книгу");
            System.out.println("4. Выдать книгу");
            System.out.println("5. Вернуть книгу");
            System.out.println("6. Удалить книгу");
            System.out.println("7. Показать доступные книги");
            System.out.println("8. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Название: ");
                    String title = scanner.nextLine();

                    System.out.print("Автор: ");
                    String author = scanner.nextLine();

                    System.out.print("Год: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Тип (1 - бумажная, 2 - электронная): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    if (type == 1) {
                        System.out.print("Количество страниц: ");
                        int pages = scanner.nextInt();
                        library.addBook(new PaperBook(id, title, author, year, pages));
                    } else {
                        System.out.print("Формат файла: ");
                        String format = scanner.nextLine();
                        library.addBook(new EBook(id, title, author, year, format));
                    }
                    break;

                case 2:
                    library.showAllBooks();
                    break;

                case 3:
                    System.out.print("Введите название: ");
                    Book found = library.findBookByTitle(scanner.nextLine());
                    if (found != null) {
                        found.showInfo();
                    } else {
                        System.out.println("Книга не найдена.");
                    }
                    break;

                case 4:
                    System.out.print("Введите название: ");
                    library.issueBook(scanner.nextLine());
                    break;

                case 5:
                    System.out.print("Введите название: ");
                    library.returnBook(scanner.nextLine());
                    break;

                case 6:
                    System.out.print("Введите название: ");
                    library.deleteBook(scanner.nextLine());
                    break;

                case 7:
                    library.showAvailableBooks();
                    break;

                case 8:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }
}