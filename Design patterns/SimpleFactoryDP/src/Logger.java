interface ILogger{
    void msg();
}

class DebugLogger implements ILogger {
    @Override
    public void msg() {
        System.out.println("This is Debug Logger");
    }
}

class InfoLogger implements ILogger {
    @Override
    public void msg() {
        System.out.println("This is Info Logger");
    }
}

class ErrorLogger implements ILogger {
    @Override
    public void msg() {
        System.out.println("This is Error Logger");
    }
}

enum LogLevel {
    INFO, DEBUG, ERROR
}

class LoggerFactory {
    public ILogger createLogger(LogLevel logger) {
        switch(logger) {
            case INFO:
                return new InfoLogger();
            case DEBUG:
                return new DebugLogger();
            case ERROR:
                return new ErrorLogger();
        }
        return null;
    }
}

public class Logger {
    public static void main(String[] args) {
        LoggerFactory lf = new LoggerFactory();
        ILogger logger = lf.createLogger(LogLevel.INFO);
        logger.msg();

        logger = lf.createLogger(LogLevel.DEBUG);
        logger.msg();
    }  
}
