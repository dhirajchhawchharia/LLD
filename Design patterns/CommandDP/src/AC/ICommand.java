package AC;

public abstract class ICommand {
    AC ac;

    public ICommand(AC airconditioner) {
        ac = airconditioner;
    }

    
    abstract public void execute(); 
}
