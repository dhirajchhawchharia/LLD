package AC;

public class CommandSetTemp extends ICommand {
    int temperature;

    public CommandSetTemp(AC ac, int temperature) {
        super(ac);
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        ac.setTemperature(temperature);
    }

    @Override
    public void undo() {
        ac.setTemperature(0);
    }
}
