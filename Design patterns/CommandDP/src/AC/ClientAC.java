package AC;

public class ClientAC {
    public static void main(String[] args) {
        AC airConditioner = new AC();

        airConditioner.turnOn();
        airConditioner.turnOff();

        ICommand command = new CommandOn(airConditioner);
        command.execute();

        command = new CommandSetTemp(airConditioner, 17);
        command.execute();

        command = new CommandOff(airConditioner);
        command.execute();

        command.undo();
    }
}
