public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    
    public void handleLogRequest(int level, String msg) {
        if(level == DEBUG) {
            System.out.println("DEBUG: " + msg);
        }
        else {
            super.handleLogRequest(level, msg);
        }
    }

}
