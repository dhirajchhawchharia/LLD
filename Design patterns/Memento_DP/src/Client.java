public class Client {
    public static void main(String[] args) {
        Caretaker mementoCaretaker = new Caretaker();

        Originator originator1 = new Originator(1, 2);

        Memento memento1 = originator1.createMemento();
        mementoCaretaker.addMemento(memento1);

        originator1.setHeight(3);
        originator1.setLength(4);

        Memento memento2 = originator1.createMemento();
        mementoCaretaker.addMemento(memento2);

        originator1.setHeight(5);
        originator1.setLength(6);

        originator1.restoreMemento(mementoCaretaker.undo());
        System.out.println(originator1.getHeight() + " " + originator1.getLength());
    }
}
