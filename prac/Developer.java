package prac;

public class Developer extends Employee {

    private String language;

    public Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println(getName() + " пишет код на " + language);
    }

    @Override
    public void info() {
        System.out.println("Developer: " + getName() +
                ", Зарплата: " + getSalary() +
                ", Язык: " + language);
    }
}
