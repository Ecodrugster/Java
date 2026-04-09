package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("ID уже существует!");
                return;
            }
        }
        books.add(book);
        System.out.println("Книга добавлена.");
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Библиотека пуста.");
            return;
        }

        for (Book b : books) {
            b.showInfo();
        }
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void deleteBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            books.remove(book);
            System.out.println("Книга удалена.");
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    public void issueBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.issueBook();
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    public void showAvailableBooks() {
        for (Book b : books) {
            if (!b.isIssued()) {
                b.showInfo();
            }
        }
    }
}