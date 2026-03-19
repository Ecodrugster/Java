public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String acc, String owner, double balance, double interestRate) {
        super(acc, owner, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть положительной");
            return;
        }

        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Снято: " + amount);
        } else {
            System.out.println("Ошибка: недостаточно средств");
        }
    }

    @Override
    public void monthlyUpdate() {
        double percent = getBalance() * interestRate / 100;
        setBalance(getBalance() + percent);
        System.out.println("Начислено: " + percent);
    }
}