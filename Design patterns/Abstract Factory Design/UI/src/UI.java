
import java.util.Objects;

interface IButton {
    void press();
}

class WindowsButton implements IButton {
    @Override
    public void press() {
        System.out.println("This is Windows Button");
    }
}

class MacButton implements IButton {
    @Override
    public void press() {
        System.out.println("This is Mac Button");
    }
}

interface ITextBox {
    void setText();
}

class WindowsTextBox implements ITextBox {
    @Override
    public void setText() {
        System.out.println("You are setting text in Windows Textbox");
    }
}

class MacTextBox implements ITextBox {
    @Override
    public void setText() {
        System.out.println("You are setting text in Mac Textbox");
    }
}

interface IFactory {
    IButton createButton();
    ITextBox createTextBox();
}

class WindowsFactory implements IFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowsTextBox();
    }
}

class MacFactory implements IFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}

class GUIFactory {
    public static  IFactory createOSFactory(String osType) {
        if (osType.equalsIgnoreCase("Windows")) {
            return new WindowsFactory();
        }
        else if (osType.equalsIgnoreCase("Mac")) {
            return new MacFactory();
        }
        return null;
    }
}

public class UI {
    public static void main(String[] args) {
        String osType = "Windows";
        IFactory uiFactory = GUIFactory.createOSFactory(osType); 
        if(Objects.nonNull(uiFactory)) {
            IButton button = uiFactory.createButton();
            ITextBox textBox = uiFactory.createTextBox();
            button.press();
            textBox.setText();
        }
    }
}
