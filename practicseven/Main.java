public class Main {
    public static void main(String[] args) {
        Employee d1 = new Developer(1, "Aurik", 50000, "Java", 10);
        Employee d2 = new Developer(2, "Vova", 60000, "Python", 15);

        Employee des1 = new Designer(3, "Olga", 40000, "Figma", 5);
        Employee des2 = new Designer(4, "Maria", 45000, "Adobe Illustrator", 3);
        Employee m1 = new Manager(5, "Ivan", 70000, 20, 5);
        
        Employee[] employees = {d1, d2, des1, des2, m1};

        double total = 0;

        for (Employee e : employees) {
            e.showInfo();
            e.work();

            double salary = e.calculateSalary();
            System.out.println("Salary: " + salary);
            System.out.println("------------------");
            total += salary;
        }

        System.out.println("Total Salary: " + total);
    }
}
