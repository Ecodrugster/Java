package oplata;

public class InstallmentPayment implements PaymentMethod {
    private int months;
    private String bank;

    public InstallmentPayment(int months, String bank) {
        this.months = months;
        this.bank = bank;
    }

    public int getMonths() {
        return months;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата в рассрочку (" + months + " мес.) через " + bank +
                ": " + amount);
    }
}