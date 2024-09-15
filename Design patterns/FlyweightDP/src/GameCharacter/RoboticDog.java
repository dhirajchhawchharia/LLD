package GameCharacter;

public class RoboticDog implements IRobot {
    private String type;
    private int[][] bitmap; 

    public RoboticDog(String type, int[][] bitmap) {
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
        System.out.println("Displaying x & y from Robotic Dog class");
    }

}
