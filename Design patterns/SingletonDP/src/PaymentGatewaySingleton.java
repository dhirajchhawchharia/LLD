
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PaymentGatewayManager {
    private static PaymentGatewayManager instance;
    private static Integer counter = 0;

    private PaymentGatewayManager() { 
        ++counter;
        System.out.println("Creating singleton instance=" + counter);
    }

    private static Lock mutex = new ReentrantLock();

    public static PaymentGatewayManager getInstance() {
        if(instance == null) {
            try {
                mutex.lock();
                if (instance == null) {    
                    instance = new PaymentGatewayManager();
                }
            } 
            finally {
                mutex.unlock();
            }
        }
        return instance;
    }
}

public class PaymentGatewaySingleton {
    public static void main(String[] args) {
        Runnable singleton = () -> {
            PaymentGatewayManager paymentGatewayManager = PaymentGatewayManager.getInstance();
        };
        Thread t1 = new Thread(singleton);
        Thread t2 = new Thread(singleton);
        Thread t3 = new Thread(singleton);
        
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
