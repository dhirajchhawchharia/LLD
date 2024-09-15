package Observable;

import Observer.ObserverInterface;

public interface ObservableInterface {
    public void add(ObserverInterface observer);
    public void remove(ObserverInterface observer);
    public void notifyObservers();
    public void updateStock(int stockCount);
    public int getStockCount();
}
