package prac;

public class Developer extends Employee {
    private String language;

    public Developer(String name, double salary, String language) {
        super(name, salary);
        setLanguage(language);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        if (language != null && !language.trim().isEmpty()) {
            this.language = language;
        } else {
            System.out.println("Ошибка: язык не может быть пустым");
        }
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

    public void addBonus() {
        increaseSalary(500);
    }
}
