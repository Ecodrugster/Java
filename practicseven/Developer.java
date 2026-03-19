public class Developer extends Employee {
    private String programmingLanguage;
    private int completedTasks;

    public Developer(int id, String name, double baseSalary, String programmingLanguage, int completedTasks) {
        super(id, name, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.completedTasks = completedTasks;
    }

    @Override
    public void work() {
        System.out.println(getName() + " пишет код на " + programmingLanguage);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + completedTasks * 1000;
    }
}