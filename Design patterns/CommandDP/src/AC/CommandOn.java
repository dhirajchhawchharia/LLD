package AC;

public class CommandOn extends ICommand {
    
    public CommandOn(AC ac) {
        super(ac);
    }

    @Override
    public void execute() {
        ac.turnOn();
    }
}
