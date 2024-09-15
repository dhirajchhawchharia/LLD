package Observer;

import Observable.ObservableInterface;

public class MobileObserver implements ObserverInterface {
    ObservableInterface observable;
    String mobileNumber;

    public MobileObserver(String mobile, ObservableInterface obj) {
        this.observable = obj;
        this.mobileNumber = mobile;
    }
    
    @Override
    public void update() {
        sendMsg("Hurry up! User:" + mobileNumber+ " Only few left in stock for iphone");
    }

    private void sendMsg(String status) {
        System.out.println(status);
    }

}
