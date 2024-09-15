package Observer;

import Observable.ObservableInterface;

public class EmailObserver implements ObserverInterface {
    ObservableInterface observable;
    String emailId;

    public EmailObserver(String email, ObservableInterface obj) {
        observable = obj;
        this.emailId = email;
    }

    @Override
    public void update() {
        sendEmail("Hurry up! User:" + emailId + " Only few left in stock");
    }

    private void sendEmail(String status) {
        System.out.println(status);
    }

}
