package GameCharacter;

public class Humanoid implements IRobot {
    private String type;
    private int[][] bitmap;

    public Humanoid(String type, int[][] bitmap) {
        this.type = type;
        this.bitmap = bitmap;
    }

    public String getType() {
        return this.type;
    }

    public int[][] getBitmap() {
        return this.bitmap;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying x & y from Humanoid");
    }
}
