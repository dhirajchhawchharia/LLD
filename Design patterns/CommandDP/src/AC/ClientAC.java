package AC;

public class ClientAC {
    public static void main(String[] args) {
        AC airConditioner = new AC();

        airConditioner.turnOn();
        airConditioner.turnOff();

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new CommandOn(airConditioner));
        remoteControl.pressButton();

        remoteControl.setCommand(new CommandSetTemp(airConditioner, 17));
        remoteControl.pressButton();

        remoteControl.setCommand(new CommandOff(airConditioner));
        remoteControl.pressButton();

        remoteControl.undo();
    }
}
