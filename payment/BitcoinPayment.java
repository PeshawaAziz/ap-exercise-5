package payment;

public class BitcoinPayment implements PaymentStrategy {
    public String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "$. (" + getPaymentDetails() + ")");
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Payment [Wallet Address: " + walletAddress + "]";
    }
}