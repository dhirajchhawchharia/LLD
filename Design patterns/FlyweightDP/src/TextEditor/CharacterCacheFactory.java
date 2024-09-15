package TextEditor;

import TextEditor.Character;
import java.util.*;

public class CharacterCacheFactory {
    public static Map<Character, ICharacter> characterCache = new HashMap<>();

    public static ICharacter createLetter(char characterValue) {
        if(characterCache.containsKey(characterValue)) {
            return characterCache.get(characterValue);
        }
        else {
            Character characterObject = new Character(characterValue, "Arial", 10);
            characterCache.put(characterObject, characterObject);
            return characterObject;
        }
    }
}
