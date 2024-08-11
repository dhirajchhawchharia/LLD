interface IButton {
    void press(String msg);
}

interface ITextBox {
    void setText(String msg);
}

class WindowsButton implements IButton {
    @Override
    public void press(String msg) {
        System.out.println("This is Windows Button: "+ msg);
    }
}

class MacButton implements IButton {
    @Override
    public void press(String msg) {
        System.out.println("This is MacButton: " + msg);
    }
}

class WindowsTextBox implements ITextBox {
    @Override
    public void setText(String msg) {
        System.out.println("This is Windows TextBox: "  + msg);
    }
}

class MacTextBox implements ITextBox {
    @Override
    public void setText(String msg) {
        System.out.println("This is Mac TextBox: "  + msg);
    }
}

interface IFactory {
    public ITextBox createTextBox();
    public IButton createButton();
} 

class WindowsFactory implements IFactory {
    @Override
    public ITextBox createTextBox() {
        return new WindowsTextBox();
    }

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}

class MacFactory implements IFactory {
    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }

    @Override
    public IButton createButton() {
        return new MacButton();
    }
}

class GUIFactory {
    public static IFactory createFactory(String platform) {
        if (platform.equalsIgnoreCase("windows")) {
            return new WindowsFactory();
        }
        else if (platform.equalsIgnoreCase("mac")) {
            return new MacFactory();
        } 
        return null;
    }
}

public class UI {
    public static void main(String[] args) {
        IFactory factory = GUIFactory.createFactory("mac");
        
        IButton button = factory.createButton();
        ITextBox textBox = factory.createTextBox();

        button.press("Pressing button");
        textBox.setText("setting text");
    }
}
