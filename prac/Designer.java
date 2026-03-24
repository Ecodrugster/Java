package prac;

public class Designer extends Employee {
    private String tool;

    public Designer(String name, double salary, String tool) {
        super(name, salary);
        setTool(tool);
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        if (tool != null && !tool.trim().isEmpty()) {
            this.tool = tool;
        } else {
            System.out.println("Ошибка: инструмент не может быть пустым");
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " делает дизайн в " + tool);
    }

    @Override
    public void info() {
        System.out.println("Designer: " + getName() +
                ", Зарплата: " + getSalary() +
                ", Инструмент: " + tool);
    }

    public void addBonus() {
        increaseSalary(400);
    }
}