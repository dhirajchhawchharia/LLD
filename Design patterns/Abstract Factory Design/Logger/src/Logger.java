import java.util.Objects;

interface IFileLogger {
    void messageToFile();
}

class ErrorFileLogger implements IFileLogger {
    @Override
    public void messageToFile() {
        System.out.println("This is Error Message printed to File");
    }
}

class DebugFileLogger implements IFileLogger {
    @Override
    public void messageToFile() {
        System.out.println("This is Debug Message printed to File");
    }
}

class InfoFileLogger implements IFileLogger {
    @Override
    public void messageToFile() {
        System.out.println("This is Info Message printed to File");
    }
}

interface IConsoleLogger {
    void messageToConsole();
}

class ErrorConsoleLogger implements IConsoleLogger {
    @Override
    public void messageToConsole() {
        System.out.println("This is Error message printed to Console");
    }
}

class DebugConsoleLogger implements IConsoleLogger {
    @Override
    public void messageToConsole() {
        System.out.println("This is Debug message printed to Console");
    }
}

class InfoConsoleLogger implements IConsoleLogger {
    @Override
    public void messageToConsole() {
        System.out.println("This is Info message printed to Console");
    }
}

interface ILoggerFactory {
    IFileLogger createFileLogger();
    IConsoleLogger createConsoleLogger();
}

class ErrorLoggerFactory implements ILoggerFactory {
    @Override
    public IFileLogger createFileLogger() {
        return new ErrorFileLogger();
    }

    @Override
    public IConsoleLogger createConsoleLogger() {
        return new ErrorConsoleLogger();
    }
}

class DebugLoggerFactory implements ILoggerFactory {
    @Override
    public IFileLogger createFileLogger() {
        return new DebugFileLogger();
    }

    @Override
    public IConsoleLogger createConsoleLogger() {
        return new DebugConsoleLogger();
    }
}

class InfoLoggerFactory implements ILoggerFactory {
    @Override
    public IFileLogger createFileLogger() {
        return new InfoFileLogger();
    }

    @Override
    public IConsoleLogger createConsoleLogger() {
        return new InfoConsoleLogger();
    }
}

class LoggerFactory {
    public static ILoggerFactory createFactory(String logType) {
        if(logType.equalsIgnoreCase("error")) 
            return new ErrorLoggerFactory();
        else if (logType.equalsIgnoreCase("debug"))
            return new DebugLoggerFactory();
        else if (logType.equalsIgnoreCase("info"))
            return new InfoLoggerFactory();
        return null;
    }
}

public class Logger {
    public static void main(String[] args) {
        String logType = "info";
        ILoggerFactory loggerFactory = LoggerFactory.createFactory(logType);
        if(Objects.nonNull(loggerFactory)) {
            IFileLogger fileLogger = loggerFactory.createFileLogger();
            IConsoleLogger consoleLogger = loggerFactory.createConsoleLogger();

            fileLogger.messageToFile();
            consoleLogger.messageToConsole();
        }
    }
}
