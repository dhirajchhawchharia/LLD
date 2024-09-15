import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> history;

    public Caretaker() {
        history = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        history.add(memento);
    }

    public Memento undo(){
        if(history.size() > 0) {
            Memento currMemento = history.get(history.size()-1);
            history.remove(history.size()-1);
            return currMemento;
        }
        return null;
    }
}