public abstract class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        if (ownerName == null || ownerName.trim().isEmpty()) {
            this.ownerName = "Unknown";
        } else {
            this.ownerName = ownerName;
        }

        this.balance = balance < 0 ? 0 : balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
    if (amount <= 0) {
        System.out.println("Ошибка: сумма должна быть положительной");
        return;
    }

    balance += amount;
    System.out.println("Пополнение: " + amount);
    }

    public abstract void withdraw(double amount);
    public abstract void monthlyUpdate();

    public void showInfo() {
        System.out.println("Счет: " + accountNumber +
                " | Владелец: " + ownerName +
                " | Баланс: " + balance);
    }

    public void transfer(BankAccount target, double amount) {
    if (target == null) {
        System.out.println("Ошибка: счет назначения не найден");
        return;
    }

    if (amount <= 0) {
        System.out.println("Ошибка: сумма должна быть > 0");
        return;
    }

    double before = this.getBalance();

    this.withdraw(amount);

    if (this.getBalance() < before) {
        target.deposit(amount);
        System.out.println("Перевод выполнен: " + amount);
    } else {
        System.out.println("Перевод не выполнен");
    }
}
}