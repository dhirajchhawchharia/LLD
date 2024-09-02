interface PaymentStrategy {
    public void processPayment(int m);
}

class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(int m) {
        System.out.println("Processing Credit card payment of INR " + m);
    }
}

class CryptocurrencyPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(int m) {
        System.out.println("Processing Cryptocurrency payment of INR " + m);
    }
}

class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(int m) {
        System.out.println("Processing Paypal payment of INR " + m);
    }
}

// context
class PaymentProcesser {
    private PaymentStrategy paymentStrategy;

    public PaymentProcesser() {
        paymentStrategy = null;
    }

    public void setPaymentStrategy(PaymentStrategy ps) {
        this.paymentStrategy = ps;
    }

    public void processPayment(int amt) {
        paymentStrategy.processPayment(amt);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new CryptocurrencyPaymentStrategy();

        PaymentProcesser paymentProcesser = new PaymentProcesser();
        paymentProcesser.setPaymentStrategy(paymentStrategy);

        paymentProcesser.processPayment(100);
    }
}
