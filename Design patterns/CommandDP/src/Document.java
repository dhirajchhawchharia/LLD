import java.util.ArrayList;
import java.util.List;

class Doc {
    public void open() {
        System.out.println("Opening the document");
    }

    public void save() {
        System.out.println("Saving the document");
    }
}

interface ICommand {
    public void execute();
}

class DocumentSave implements ICommand {
    Doc doc;

    public DocumentSave(Doc doc) {
        this.doc = doc;
    }

    public void execute() {
        doc.save();
    }
}

class DocumentOpen implements ICommand {
    Doc doc;

    public DocumentOpen(Doc doc) {
        this.doc = doc;
    }

    public void execute() {
        doc.open();
    }
}

class CommandInvoker {
    List<ICommand> commands;

    public CommandInvoker(){
        this.commands = new ArrayList<>();
    }

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public void executeCommands() {
        for(ICommand command : commands) {
            command.execute();
        }
    }
}

public class Document {
    public static void main(String[] args) {
        Doc doc = new Doc();

        ICommand command1 = new DocumentOpen(doc);
        ICommand command2 = new DocumentSave(doc);
        
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommand(command1);
        commandInvoker.addCommand(command2);

        commandInvoker.executeCommands();
    }
}
