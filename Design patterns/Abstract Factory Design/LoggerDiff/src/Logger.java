import java.util.Objects;

interface IErrorLogger {
    void msg();
}

class ConsoleErrorLogger implements IErrorLogger {
    @Override
    public void msg() {
        System.out.println("This is Console Error logger");    
    }
}

class FileErrorLogger implements IErrorLogger {
    @Override
    public void msg() {
        System.out.println("This is File Error logger");    
    }
}

interface IDebugLogger {
    void msg();
}

class ConsoleDebugLogger implements IDebugLogger {
    @Override
    public void msg() {
        System.out.println("This is Console Debug logger");    
    }
}

class FileDebugLogger implements IDebugLogger {
    @Override
    public void msg() {
        System.out.println("This is File Debug logger");    
    }
}

interface IInfoLogger {
    void msg();
}

class ConsoleInfoLogger implements IInfoLogger {
    @Override
    public void msg() {
        System.out.println("This is Console Info logger");    
    }
}

class FileInfoLogger implements IInfoLogger {
    @Override
    public void msg() {
        System.out.println("This is File Info logger");    
    }
}

interface ILoggerCreator {
    IErrorLogger createErrorLogger();
    IDebugLogger createDebugLogger();
    IInfoLogger createInfoLogger();
}

class FileLoggerCreator implements ILoggerCreator {
    @Override
    public IErrorLogger createErrorLogger() {
        return new FileErrorLogger();
    }

    @Override
    public IDebugLogger createDebugLogger() {
        return new FileDebugLogger();
    }

    @Override
    public IInfoLogger createInfoLogger() {
        return new FileInfoLogger();
    }
}

class ConsoleLoggerCreator implements ILoggerCreator {
    @Override
    public IErrorLogger createErrorLogger() {
        return new ConsoleErrorLogger();
    }

    @Override
    public IDebugLogger createDebugLogger() {
        return new ConsoleDebugLogger();
    }

    @Override
    public IInfoLogger createInfoLogger() {
        return new ConsoleInfoLogger();
    }
}

class FactoryCreator {
    public static ILoggerCreator createLoggers(String outputType) {
        if(outputType.equalsIgnoreCase("file")) {
            return new FileLoggerCreator();
        }
        else if (outputType.equalsIgnoreCase("console")) {
            return new ConsoleLoggerCreator();
        }
        return null;
    }
}

public class Logger {
    public static void main(String[] args) {
        String outputType = "Console";
        ILoggerCreator loggerCreator = FactoryCreator.createLoggers(outputType);
        if(Objects.nonNull(loggerCreator)) {
            IErrorLogger errorLogger = loggerCreator.createErrorLogger();
            IDebugLogger debugLogger = loggerCreator.createDebugLogger();
            IInfoLogger infoLogger = loggerCreator.createInfoLogger();

            errorLogger.msg();
            debugLogger.msg();
            infoLogger.msg();
        }
    }
}
