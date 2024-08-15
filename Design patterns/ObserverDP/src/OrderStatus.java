import java.util.ArrayList;
import java.util.List;

interface IObserver {
    void notify(String status);
}

class Customer implements IObserver {
    @Override
    public void notify(String status) {
        System.out.println("This is Customer getting status: " + status); 
   }
}

class Restaurant implements IObserver {
    @Override
    public void notify(String status) {
        System.out.println("This is Restaurant getting status: " + status); 
   }
}

class DeliveryPartner implements IObserver {
    @Override
    public void notify(String status) {
        System.out.println("This is DeliveryPartner getting status: " + status); 
   }
}

class CallCenter implements IObserver {
    @Override
    public void notify(String status) {
        System.out.println("This is CallCenter getting status: " + status); 
   }
}

class OrderStatusSubject {
    String currentStatus;
    List<IObserver> observers;

    public OrderStatusSubject() {
        currentStatus = "";
        observers = new ArrayList<>();
    }

    void attachObserver(IObserver observer) {
        observers.add(observer);
    }

    void detachObserver(IObserver observer) {
        observers.remove(observer);
    }

    void setStatus(String status) {
        currentStatus = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for(IObserver observer : observers) {
            observer.notify(currentStatus);
        }
    }
}

public class OrderStatus {
    public static void main(String[] args) {
        OrderStatusSubject subject = new OrderStatusSubject();

        Customer customer = new Customer();
        Restaurant restaurant = new Restaurant();
        DeliveryPartner deliveryPartner = new DeliveryPartner();
        CallCenter callCenter = new CallCenter();

        subject.attachObserver(customer);
        subject.attachObserver(restaurant);
        subject.attachObserver(deliveryPartner);
        subject.attachObserver(callCenter);

        subject.setStatus("Order placed successfully");

        subject.detachObserver(callCenter);

        subject.setStatus("Order is Out for Delivery");
    }
}
