import java.util.ArrayList;

package payment;

public abstract class Customer {
    protected String name;
    protected ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        paymentHistory.add(paymentStrategy.getPaymentDetails());
    }

    public void showPaymentHistory() {
        System.out.println("Payment History for " + name + ":");
        for (String payment : paymentHistory) {
            System.out.println(payment);
        }
    }
}

class RegularCustomer extends Customer {
    public RegularCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Regular Customer: " + name);
    }
}

class PremiumCustomer extends Customer {
    public PremiumCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Premium Customer: " + name);
    }
}