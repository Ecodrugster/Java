package practic;

// 1
// public class Student {

//     String name;
//     int age;
//     int grade;

//     public Student(String name, int age, int grade) {
//         this.name = name;
//         this.age = age;
//         this.grade = grade;
//     }
    
//     public void printInfo() {
//         System.out.println("Имя: " + name + ", Возраст: " + age + ", Класс: " + grade);
//     }
    
//     public void increaseGrade() {
//         grade += 5;
//     }

//     public static void main(String[] args) {
//         Student s1 = new Student("Mark", 21, 81);
//         Student s2 = new Student("Melissa", 20, 84);
//         Student s3 = new Student("Masha", 22, 90);
        
//         System.out.println("До увеличения оценки: ");
//         s1.printInfo();
//         s2.printInfo();
//         s3.printInfo();
        
//         s1.increaseGrade();
//         s2.increaseGrade();
//         s3.increaseGrade();
        
//         System.out.println("После увеличения оценки: ");
//         s1.printInfo();
//         s2.printInfo();
//         s3.printInfo();
//     }
// }

// 2
// public class Car {
//     String brand;
//     int year;
//     int speed;

//     public Car(String brand, int year, int speed) {
//         this.brand = brand;
//         this.year = year;
//         this.speed = speed;
//         }

//         public void accelerate(int value){
//             speed += value;
//         }
//         public void brake(int value) {
//             speed -= value;
//             if (speed < 0) {
//                 speed = 0;
//             }
//         }

//         public void printInfo() {
//             System.out.println("Марка: " + brand + ", Год: " + year + ", Скорость: " + speed);
//         }

//         public static void main(String[] args) {
//             Car c1 = new Car("Mazda", 2010, 0);
//             Car c2 = new Car("Honda", 2014, 0);

//             System.out.println("До ускорения: ");
//             c1.printInfo();
//             c2.printInfo();

//             c1.accelerate(100);
//             c2.accelerate(90);

//             System.out.println("После ускорения: ");
//             c1.printInfo();
//             c2.printInfo();

//             c1.brake(50);
//             c2.brake(130);

//             System.out.println("После торможения :");
//             c1.printInfo();
//             c2.printInfo();
//         }
//  }


// 3

// public class Rectangle {

//     double width;
//     double height;

//     public Rectangle(double width, double height) {
//         this.width = width;
//         this.height = height;
//     }
//     public double area() {
//         return width * height;
//     }

//     public double perimeter() {
//         return 2 * (width + height);
//     }

//     public static void main(String[] args) {

//         Rectangle r1 = new Rectangle(5.0, 3.0);
//         Rectangle r2 = new Rectangle(7.5, 4.2);

//         System.out.println("Прямоугольник 1:");
//         System.out.println("Площадь: " + r1.area());
//         System.out.println("Периметр: " + r1.perimeter());

//         System.out.println();

//         System.out.println("Прямоугольник 2:");
//         System.out.println("Площадь: " + r2.area());
//         System.out.println("Периметр: " + r2.perimeter());
//     }
// }

// 4

// public class BankAccount {

//     String owner;
//     double balance;

//     public BankAccount(String owner, double balance) {
//         this.owner = owner;
//         this.balance = balance;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Пополнение на " + amount);
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount <= balance && amount > 0) {
//             balance -= amount;
//             System.out.println("Снятие " + amount + " успешно.");
//         } else {
//             System.out.println("Недостаточно средств.");
//         }
//     }

//     public void printBalance() {
//         System.out.println("Владелец: " + owner +
//                 ", Баланс: " + balance);
//     }

//     public static void main(String[] args) {

//         BankAccount account = new BankAccount("Alice", 1000);

//         account.printBalance();

//         account.deposit(500);
//         account.printBalance();


//         account.withdraw(300);
//         account.printBalance();

//         account.withdraw(2000);
//         account.printBalance();
//     }
// }

// 5

// public class Book {
//     String name;
//     String author; 
//     int pages;


//     public Book (String name, String author, int pages) {
//         this.name = name;
//         this.author = author;
//         this.pages = pages;
//     }

//     public void printInfo() {
//     System.out.println("Название: " + name + ", Автор: " + author + ", Страницы: " + pages);
//     }

//     public boolean isBigBook() {
//         return pages > 300;
//     }

//     public static void main (String[] args) {
//         Book b1 = new Book("Harry Potter", "J.K. Rowling", 350);
//         Book b2 = new Book("Clean Code", "Robert Martin", 450);
//         Book b3 = new Book("Animal Farm", "George Orwell", 120);

        
//         Book[] books = {b1, b2, b3};

//         for (Book book : books) {
//             book.printInfo();
//             if (book.isBigBook()) {
//                 System.out.println("Это большая книга.\n");
//             } else {
//                 System.out.println("Это небольшая книга.\n");
//             }
//         }
//     }
// }

// 6
// public class Phone {

//     String brand;
//     String model;
//     int batteryLevel;

//     public Phone(String brand, String model, int batteryLevel) {
//         this.brand = brand;
//         this.model = model;

//         if (batteryLevel < 0) {
//             this.batteryLevel = 0;
//         } else if (batteryLevel > 100) {
//             this.batteryLevel = 100;
//         } else {
//             this.batteryLevel = batteryLevel;
//         }
//     }

//     public void call() {
//         if (batteryLevel >= 10) {
//             batteryLevel -= 10;
//             System.out.println("Звонок выполнен.");
//         } else {
//             System.out.println("Недостаточно заряда для звонка.");
//         }
//     }

//     public void charge() {
//         batteryLevel = 100;
//         System.out.println("Телефон полностью заряжен.");
//     }

//     public void printStatus() {
//         System.out.println("Телефон: " + brand + " " + model +
//                 ", Заряд: " + batteryLevel + "%");
//     }

//     public static void main(String[] args) {

//         Phone phone = new Phone("Samsung", "Galaxy S23", 50);

//         phone.printStatus();

//         phone.call();
//         phone.printStatus();

//         phone.call();
//         phone.printStatus();

//         phone.charge();
//         phone.printStatus();
//     }
// }

// 7
// public class Employee {

//     String name;
//     double salary;

//     public Employee(String name, double salary) {
//         this.name = name;
//         this.salary = salary;
//     }

//     public void raiseSalary(double percent) {
//         if (percent > 0) {
//             salary += salary * percent / 100;
//         }
//     }
//     public void printInfo() {
//         System.out.println("Сотрудник: " + name +
//                 ", Зарплата: " + salary);
//     }

//     public static void main(String[] args) {
//         Employee e1 = new Employee("Alice", 1000);
//         Employee e2 = new Employee("Bob", 1500);

//         System.out.println("До повышения:");
//         e1.printInfo();
//         e2.printInfo();

//         e1.raiseSalary(10);
//         e2.raiseSalary(20);

//         System.out.println("\nПосле повышения:");
//         e1.printInfo();
//         e2.printInfo();
//     }
// }


// 8
public class Product {
    String name;
    double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Товар: " + name +
                ", Цена: " + price);
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product("Laptop", 120000);
        products[1] = new Product("Mouse", 2500);
        products[2] = new Product("Keyboard", 7000);

        for (Product product : products) {
            product.printInfo();
        }
    }
}