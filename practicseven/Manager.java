public class Manager extends Employee {
    private int teamSize;
    private int closedProjects;


    public Manager(int id, String name, double baseSalary, int teamSize, int closedProjects) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
        this.closedProjects = closedProjects;
    }

    @Override
    public void work() {
        System.out.println(getName() + " управляе командой из " + teamSize + " человек и завершил " + closedProjects + " проектов.");
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + closedProjects * 2000;
    }
}


