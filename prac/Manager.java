package prac;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(getName() + " управляет командой из " + teamSize + " человек");
    }

    @Override
    public void info() {
        System.out.println("Manager: " + getName() +
                ", Зарплата: " + getSalary() +
                ", Команда: " + teamSize);
    }
}