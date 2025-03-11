package payment;

public class PayPalPayment implements PaymentStrategy {
    public String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "$. (" + getPaymentDetails() + ")");
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Payment [Email: " + email + "]";
    }
}