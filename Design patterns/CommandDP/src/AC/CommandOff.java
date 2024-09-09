package AC;

public class CommandOff extends ICommand {

    public CommandOff(AC ac) {
        super(ac);
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
