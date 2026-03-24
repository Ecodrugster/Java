package prac;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        setTeamSize(teamSize);
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        if (teamSize > 0) {
            this.teamSize = teamSize;
        } else {
            System.out.println("Ошибка: команда должна быть > 0");
        }
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

    public void addBonus() {
        increaseSalary(1000);
    }
}