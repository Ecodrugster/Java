package oplata;

public class KaspiTransferPayment implements PaymentMethod {
    private String receiverPhone;
    private String receiverName;

    public KaspiTransferPayment(String receiverPhone, String receiverName) {
        this.receiverPhone = receiverPhone;
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public String getReceiverName() {
        return receiverName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Перевод через Kaspi: " + amount +
                " | Получатель: " + receiverName +
                " | Телефон: " + receiverPhone);
    }
}
