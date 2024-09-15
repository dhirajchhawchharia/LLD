
import Observable.IphoneObservableImpl;
import Observable.ObservableInterface;
import Observer.EmailObserver;
import Observer.MobileObserver;
import Observer.ObserverInterface;

public class NotifyMeAmazon {
    public static void main(String[] args) {
        ObservableInterface iphoneObservable = new IphoneObservableImpl();

        ObserverInterface observer1 = new MobileObserver("9912124124", iphoneObservable);
        ObserverInterface observer2 = new EmailObserver("1@gmail.com", iphoneObservable);
        ObserverInterface observer3 = new EmailObserver("2@gmail.com", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.updateStock(10);

        
    }
}
