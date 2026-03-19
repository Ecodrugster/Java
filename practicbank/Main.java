public class Main {
    public static void main(String[] args) {
    
        BankAccount a1 = new DebitAccount("D1", "Ivan", 30000);
        BankAccount a2 = new DebitAccount("D2", "Maria", 50000);

        BankAccount a3 = new CreditAccount("C1", "Vova", 20000, 50000);
        BankAccount a4 = new CreditAccount("C2", "Aurik", 40000, 60000);

        BankAccount a5 = new SavingsAccount("S1", "Masha", 10000, 2);
        BankAccount a6 = new SavingsAccount("S2", "Arman", 15000, 3);

        BankAccount[] accounts = {a1, a2, a3, a4, a5, a6};

        double total = 0;
        BankAccount max = accounts[0];

        int debit = 0, savings = 0, credit = 0;

        for (BankAccount account : accounts) {
            System.out.println("------Аккаунт------");
            account.showInfo();

            account.deposit(10000);
            account.withdraw(30000);
            account.monthlyUpdate();

            System.out.println("После пополнения и снятия средств: " + account.getBalance());
            

            total += account.getBalance();
            if (account.getBalance() > max.getBalance()) {
                max = account;
            }
            if (account instanceof DebitAccount) {
                debit++;
            } else if (account instanceof SavingsAccount) {
                savings++;
            } else if (account instanceof CreditAccount) {
                credit++;
            }
        }

        System.out.println("------ИТОГО------");
        System.out.println("Общая сумма счетов: " + total);
        System.out.println("Самый богатый счет: " + max.getOwnerName() + " " + max.getBalance());
        System.out.println("Debit: " + debit);
        System.out.println("Savings: " + savings);
        System.out.println("Credit: " + credit);
        System.out.println("------ПЕРЕВОД------");
        a1.showInfo();
        a1.transfer(a2, 5000);
        System.out.println("------ПОСЛЕ ПЕРЕВОДА------");  
        a1.showInfo();
        a2.showInfo();
        
    }

    
}