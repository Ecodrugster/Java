package oplata;

public class Main {
    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        PaymentMethod[] payments = new PaymentMethod[] {
                new CardPayment("1111 5555 9999", "Aurean"),
                new CashPayment("KZT"),
                new MobilePayment("+7747299499"),
                new KaspiTransferPayment("+77081220000", "Vova"),
                new KaspiQrPayment("QR144942E", "Magnum"),
                new InstallmentPayment(12, "Kaspi")
        };

        double amount = 10000;

        for (PaymentMethod payment : payments) {
            payment.pay(amount);
            System.out.println("------");
        }
    }
}
