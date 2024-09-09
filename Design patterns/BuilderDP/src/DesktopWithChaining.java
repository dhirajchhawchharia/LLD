//
//
//
//class Desktop {
//    String RAM;
//     String Processor;
//     String Monitor;
//     String Keyboard;
//
//   public void display() {
//       System.out.println("This is a desktop with ram=" + RAM + " processor=" + Processor + " monitor=" + Monitor + " keyboard=" + Keyboard);
//   }
//}
//
//abstract class Builder {
//    Desktop desktop;
//
//    public Builder(Desktop desktop) {
//        this.desktop = desktop;
//    }
//
//    abstract public Builder buildRam();
//    abstract public Builder buildProcessor();
//    abstract public Builder buildMonitor();
//    abstract public Builder buildKeyboard();
//
//    public Desktop getDesktop() {
//        return desktop;
//    }
//
//    public Desktop build() {
//        return desktop;
//    }
//}
//
//class DellBuilder extends Builder {
//
//    public DellBuilder(Desktop desktop) {
//        super(desktop);
//    }
//
//    @Override
//    public Builder buildRam() {
//        desktop.RAM = "8gb";
//        return this;
//    }
//
//    @Override
//    public Builder buildProcessor() {
//        desktop.Processor = "i9";
//        return this;
//    }
//
//    @Override
//    public Builder buildMonitor() {
//        desktop.Monitor = "dell monitor";
//        return this;
//    }
//
//    @Override
//    public Builder buildKeyboard() {
//        desktop.Keyboard = "dell keyboard";
//        return this;
//    }
//}
//
//class Director {
//    public Desktop buildDesktop(Builder builder) {
//        return builder.buildRam().buildProcessor().buildMonitor().buildKeyboard().build();
//    }
//}
//
//public class DesktopWithChaining {
//    public static void main(String[] args) {
//        Desktop desktop = new Desktop();
//        Builder builder = new DellBuilder(desktop);
//        Director director = new Director();
//        desktop = director.buildDesktop(builder);
//        desktop.display();
//    }
//}
