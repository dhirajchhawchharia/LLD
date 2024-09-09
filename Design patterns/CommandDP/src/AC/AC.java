package AC;

public class AC {
    boolean isOn;
    int temperature;
    
    public void turnOn() {
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int t) {
        temperature = t;
        System.out.println("Temperature is set to: " + t);
    }
}
