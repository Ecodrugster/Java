package prac;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ошибка: имя не может быть пустым");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Ошибка: зарплата не может быть < 0");
        }
    }

    public void work() {
        System.out.println("Сотрудник работает");
    }

    public void info() {
        System.out.println("Имя: " + name + ", Зарплата: " + salary);
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }
}