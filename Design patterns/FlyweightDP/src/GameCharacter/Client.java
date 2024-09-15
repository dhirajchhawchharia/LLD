package GameCharacter;

public class Client {
    public static void main(String[] args) {
        RoboticCacheFactory roboticCacheFactory = new RoboticCacheFactory();

        IRobot humanoid1 = roboticCacheFactory.createRobot("HUMANOID");
        humanoid1.display(1, 1);

        IRobot humanoid2 = roboticCacheFactory.createRobot("HUMANOID");
        humanoid1.display(1, 2);

        IRobot roboticDog1 = roboticCacheFactory.createRobot("ROBOTICDOG");
        roboticDog1.display(2, 2);

        IRobot roboticDog2 = roboticCacheFactory.createRobot("ROBOTICDOG");
        roboticDog2.display(2, 3);
    }
}
