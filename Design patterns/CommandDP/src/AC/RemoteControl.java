package AC;

import java.util.Stack;

public class RemoteControl {
    ICommand command;
    Stack<ICommand> history = new Stack<>();

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        history.add(command);
    }

    public void undo() {
        if(!history.empty()) {
            ICommand c = history.pop();
            c.execute();
        }
    }
}
