package oplata;

public class CardPayment implements PaymentMethod {
    private String cardNumber;
    private String holderName;

    public CardPayment(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " с картой " + cardNumber + " владельца " + holderName);
    }
}
