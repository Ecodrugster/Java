public class DebitAccount extends BankAccount {

    public DebitAccount(String acc, String owner, double balance) {
        super(acc, owner, balance);
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
    }
}