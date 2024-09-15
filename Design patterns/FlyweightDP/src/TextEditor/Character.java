package TextEditor;

public class Character implements ICharacter {
    private char characterValue;
    private String fontType;
    private int fontSize;

    public Character(char characterValue, String fontType, int fontSize) {
        this.characterValue = characterValue;
        this.fontSize = fontSize;
        this.fontType = fontType;
    }

    @Override
    public void display(int row, int col) {
        System.out.println("Displaying character at row and col: ");
    }

}
