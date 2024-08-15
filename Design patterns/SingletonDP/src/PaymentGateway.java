

class PaymentGatewayManager {
    private static PaymentGatewayManager instance;
    private static Integer counter = 0;

    private PaymentGatewayManager() {
        counter++;
        System.out.println("Singleton instance created and totalcount=" + counter);
    }

    public void show() {
        System.out.println("Printing singleton instance: " + instance);
    }

    public static PaymentGatewayManager getInstance() {
        if(instance == null) {
            instance = new PaymentGatewayManager();
        }
        return instance;
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Runnable createSingleton = () -> {
            PaymentGatewayManager paymentGatewayManager = PaymentGatewayManager.getInstance();
            paymentGatewayManager.show();
        };
        Thread t1 = new Thread(createSingleton);
        Thread t2 = new Thread(createSingleton);
        Thread t3 = new Thread(createSingleton);
        
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
