public abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary < 0 ? 0 : baseSalary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary < 0 ? 0 : baseSalary;
    }
    public void showInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: " + baseSalary);
    }

    public abstract void work();
    public abstract double calculateSalary();
}
