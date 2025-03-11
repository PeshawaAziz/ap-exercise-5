package payment;

public class CreditCardPayment implements PaymentStrategy {
    public String cardNumber;
    public String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "$. (" + getPaymentDetails() + ")");
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card Payment [Card Number: " + cardNumber + ", Card Holder: " + cardHolderName + "]";
    }
}