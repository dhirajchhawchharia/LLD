package GameCharacter;

import java.util.*;

public class RoboticCacheFactory {
    Map<String, IRobot> robotObjectCache = new HashMap<>();

    public IRobot createRobot(String type) {
        if(robotObjectCache.containsKey(type)) {
            return robotObjectCache.get(type);
        }
        else {
            if(type.equals("HUMANOID")) {
                int[][] bitmap = new int[100][100];
                IRobot humanoidRobot = new Humanoid(type, bitmap);
                robotObjectCache.put(type, humanoidRobot);
                return humanoidRobot;
            }
            else if (type.equals("ROBOTICDOG")) {
                int[][] bitmap = new int[100][100];
                IRobot roboticDog = new RoboticDog(type, bitmap);
                robotObjectCache.put(type, roboticDog);
                return roboticDog;
            }
        }
        return null;
    }


}
