interface ILogger {
    public void message();
}

class ErrorLogger implements ILogger {
    @Override
    public void message() {
        System.out.println("ERROR : Printed by msg function");
    }
}

class InfoLogger implements ILogger {
    @Override
    public void message() {
        System.out.println("INFO : Printed by msg function");
    }
}

class DebugLogger implements ILogger {
    @Override
    public void message() {
        System.out.println("DEBUG : Printed by msg function");
    }
}

interface ILoggerFactory {
    public ILogger createLogger();
}

class ErrorLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        System.out.println("Printing from ErrorLoggerFactory");
        return new ErrorLogger();
    }
}

class InfoLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        System.out.println("Printing from InfoLoggerFactory");
        return new InfoLogger();
    }
}

class DebugLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        System.out.println("Printing from DebugLoggerFactory");
        return new DebugLogger();
    }
}

public class Logger {
    public static void main(String[] args) {
        ILoggerFactory loggerFactory = new DebugLoggerFactory();
        ILogger logger = loggerFactory.createLogger();

        logger.message();
    }
}