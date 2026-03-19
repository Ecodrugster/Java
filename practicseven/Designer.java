public class Designer extends Employee {
    private String designTool;
    private int completedLayouts;

    public Designer(int id, String name, double baseSalary, String designTool, int completedLayouts) {
        super(id, name, baseSalary);
        this.designTool = designTool;
        this.completedLayouts = completedLayouts;
    }

    @Override
    public void work() {
        System.out.println(getName() + " делает макеты в " + designTool);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + completedLayouts * 800;
    }
}