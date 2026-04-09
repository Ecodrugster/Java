package oplata;

public class KaspiQrPayment implements PaymentMethod {
    private String qrCode;
    private String shopName;

    public KaspiQrPayment(String qrCode, String shopName) {
        this.qrCode = qrCode;
        this.shopName = shopName;
    }

    public String getQrCode() {
        return qrCode;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата через Kaspi QR: " + amount +
                " | Магазин: " + shopName);
    }
}
