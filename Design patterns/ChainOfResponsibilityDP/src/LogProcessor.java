public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private LogProcessor nextLogProcessor;

    protected LogProcessor(LogProcessor nexLogProcessor) {
        nextLogProcessor = nexLogProcessor;
    }

    protected void handleLogRequest(int level, String msg) {
        if(nextLogProcessor != null) {
            nextLogProcessor.handleLogRequest(level, msg);
        }
        else {
            System.out.println("No handler found to handle log request");
        }
    }
}
