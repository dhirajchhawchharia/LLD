interface PaymentStrategy {
    public void processPayment(int amount);
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

class PaymentStrategyFactory {
    public static PaymentStrategy createPaymentStrategy(String name) {
        if(name.equalsIgnoreCase("paypal"))
            return new PaypalPaymentStrategy();
        else if(name.equalsIgnoreCase("crypto"))
            return new CryptocurrencyPaymentStrategy();
        else if(name.equalsIgnoreCase("credit card"))
            return new CreditCardPaymentStrategy();
        return null;
    }
}

//context
class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(String paymentMethod) {
        paymentStrategy = PaymentStrategyFactory.createPaymentStrategy(paymentMethod);
    }

    public void processPayment(int amount) {
        paymentStrategy.processPayment(amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor("paypal");
        paymentProcessor.processPayment(100);
    }
}


