public class Originator {
    private int height;
    private int length;

    public Originator(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLength() {
        return this.length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Memento createMemento() {
        return new Memento(height, length);
    }

    public void restoreMemento(Memento memento) {
        this.height = memento.getHeight();
        this.length = memento.getLength();
    }
}