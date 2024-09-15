package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.ObserverInterface;

public class IphoneObservableImpl implements ObservableInterface {
    List<ObserverInterface> observers;
    int stockCount = 0;

    public IphoneObservableImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void add(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void remove(ObserverInterface observer) {
       observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(ObserverInterface observer : observers) {
            observer.update();
        }
    }

    @Override
    public void updateStock(int stockCount) {
        if(this.stockCount == 0) {
            notifyObservers();
        }
        this.stockCount += stockCount;
        System.out.println(stockCount);
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

}
