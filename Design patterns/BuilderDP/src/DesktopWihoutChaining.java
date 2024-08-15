

class Desktop {
     String RAM;
      String Processor;
      String Monitor;
      String Keyboard;

    public void display() {
        System.out.println("This is a desktop with ram=" + RAM + " processor=" + Processor + " monitor=" + Monitor + " keyboard=" + Keyboard);
    }
}

abstract class Builder {
    protected Desktop desktop;

    public abstract void buildRam();
    public abstract void buildProcessor();
    public abstract void buildMonitor();
    public abstract void buildKeyboard();
    public Desktop getDesktop() {
        return desktop;
    }
}

class DellBuilder extends Builder {

    @Override
    public void buildRam() {
        desktop.RAM = "8gb";
    }

    @Override
    public void buildProcessor() {
        desktop.Processor = "i7 11th gen";
    }

    @Override
    public void buildMonitor() {
        desktop.Monitor = "dell monitor";
    }

    @Override
    public void buildKeyboard() {
        desktop.Keyboard = "dell keyboard";
    }
    
}

class Director {

    public Desktop buildDesktop(Builder builder) {
        builder.buildRam();
        builder.buildMonitor();
        builder.buildProcessor();
        builder.buildKeyboard();
        return builder.getDesktop();
    }
}

public class DesktopWihoutChaining {
    public static void main(String[] args) {
        Builder builder = new DellBuilder();
        Director director = new Director();
        Desktop desktop = director.buildDesktop(builder);

        desktop.display();
    }
}
