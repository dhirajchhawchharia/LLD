public class Client {
    public static void main(String[] args) {
        LogProcessor processor = new InfoLogProcessor(
            new DebugLogProcessor(
                new ErrorLogProcessor(null)
            )
        );

        processor.handleLogRequest(1, "normal informative message");
        processor.handleLogRequest(2, "useful for debugging purposes");
        processor.handleLogRequest(3, "the application throws an error");
        processor.handleLogRequest(4, "not going to be printed");
    }
}
