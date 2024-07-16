
interface ILogger {
    void message();
}

class InfoLogger implements ILogger {
    @Override
    public void message() {
       System.out.println("INFO: This is msg printed");
    }
}

class DebugLogger implements ILogger {
    @Override
    public void message() {
       System.out.println("DEBUG: This is msg printed");
    }
}

class ErrorLogger implements ILogger {
    @Override
    public void message() {
       System.out.println("ERROR: This is msg printed");
    }
}

enum LogLevel {
    INFO, ERROR, DEBUG
}

class LoggerFactory {
    public static ILogger createLogger(LogLevel logLevel) {
        switch (logLevel) {
            case DEBUG -> {
                return new DebugLogger();
            }
            case ERROR -> {
                return new ErrorLogger();
            }
            case INFO -> {
                return new InfoLogger();
            }
            default -> {
            }
        }
        return null;
    }
}

public class Logger {
    public static void main(String[] args) {
        ILogger logger = LoggerFactory.createLogger(LogLevel.ERROR);

        logger.message();
    }
}
