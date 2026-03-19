package prac;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;

        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void work() {
        System.out.println("Сотрудник работает");
    }

    public void info() {
        System.out.println("Имя: " + name + ", Зарплата: " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}