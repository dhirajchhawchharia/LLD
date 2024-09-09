public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void handleLogRequest(int level, String msg) {
        if(level == ERROR) {
            System.out.println("ERROR: " + msg);
        }
        else {
            super.handleLogRequest(level, msg);
        }
    }
}
