public class CreditAccount extends BankAccount {
    private double creditLimit;

    public CreditAccount(String acc, String owner, double balance, double creditLimit) {
        super(acc, owner, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть положительной");
            return;
        }

        if (getBalance() - amount >= -creditLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Снято (кредит): " + amount);
        } else {
            System.out.println("Ошибка: превышен лимит");
        }
    }

    @Override
    public void monthlyUpdate() {
        setBalance(getBalance() - 1000);
        System.out.println("Комиссия: 1000");
    }
}