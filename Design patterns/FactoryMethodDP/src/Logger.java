interface ILogger{
    void msg(String s);
}

class DebugLogger implements ILogger {
    @Override
    public void msg(String s) {
        System.out.println("This is Debug Logger: " + s);
    }
}

class InfoLogger implements ILogger {
    @Override
    public void msg(String s) {
        System.out.println("This is Info Logger: " + s);
    }
}

class ErrorLogger implements ILogger {
    @Override
    public void msg(String s) {
        System.out.println("This is Error Logger: " + s);
    }
}

interface ILoggerFactory {
    public ILogger createFactory();
}

class ErrorLoggerFactory implements ILoggerFactory {
    @Override
    public ErrorLogger createFactory() {
        return new ErrorLogger();
    }
}

class InfoLoggerFactory implements ILoggerFactory {
    @Override
    public InfoLogger createFactory() {
        return new InfoLogger();
    }
}

class DebugLoggerFactory implements ILoggerFactory {
    @Override
    public DebugLogger createFactory() {
        return new DebugLogger();
    }
}

public class Logger {
    public static void main(String[] args) {
        ILoggerFactory loggerFactory = new DebugLoggerFactory();
        ILogger logger = loggerFactory.createFactory();

        logger.msg("HeDebug");

        loggerFactory = new InfoLoggerFactory();
        logger = loggerFactory.createFactory();

        logger.msg("HeInfo");
    }
}
