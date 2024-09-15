public class Memento {
    private int height;
    private int length;

    public Memento(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLength() {
        return this.length;
    }
}