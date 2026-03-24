package prac;

public class Main {
    public static void main(String[] args) {

        Developer dev = new Developer("Alex", 3000, "Java");
        Designer des = new Designer("Olga", 2500, "Figma");
        Manager man = new Manager("Ivan", 4000, 5);

        dev.info();
        des.info();
        man.info();

        System.out.println();

        dev.work();
        des.work();
        man.work();

        System.out.println();

        dev.setName("New Alex");
        dev.setSalary(3500);
        dev.setLanguage("Python");

        dev.info();

        System.out.println();

        dev.setName("");
        dev.setSalary(-100);
        dev.setLanguage("");

        System.out.println();

        dev.addBonus();
        dev.info();
    }
}