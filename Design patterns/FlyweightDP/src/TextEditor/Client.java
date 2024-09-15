package TextEditor;

public class Client {
    public static void main(String[] args) {
        ICharacter tCharacter = CharacterCacheFactory.createLetter('t');
        tCharacter.display(0, 0);
    }
}
