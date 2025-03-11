import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer customer1 = new RegularCustomer("Hiwa N.");
        RegularCustomer customer2 = new RegularCustomer("Hozan G.");
        PremiumCustomer customer3 = new PremiumCustomer("Dilan A.");

        CreditCardPayment creditCardPayment = new CreditCardPayment("6677-0011-8819-0992", "Tony Stark");
        PayPalPayment payPalPayment = new PayPalPayment("steve.rogers@marvel.com");
        BitcoinPayment bitcoinPayment = new BitcoinPayment("234934peterparkerwashere2348283");

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        customer1.makePayment(creditCardPayment, 4958);
        customer1.makePayment(payPalPayment, 43453);
        customer2.makePayment(creditCardPayment, 34243);
        customer2.makePayment(bitcoinPayment, 91884);
        customer3.makePayment(payPalPayment, 13816);
        customer3.makePayment(bitcoinPayment, 7527);

        customer1.showPaymentHistory();
        customer2.showPaymentHistory();
        customer3.showPaymentHistory();
    }
}