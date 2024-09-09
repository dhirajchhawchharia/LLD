public class InfoLogProcessor extends LogProcessor{
    
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void handleLogRequest(int level, String msg) {
        if(level == INFO) {
            System.out.println("INFO: " + msg);
        }
        else {
            super.handleLogRequest(level, msg);
        }
    }
}
