package exercisesandtests.testafter16;

public class MessageLogger {

    private static MessageLogger logger = null;
    private String lastLog = "";

    private MessageLogger() {
    }

    public static MessageLogger getInstance() {
        if (logger == null) {
            logger = new MessageLogger();
        }
        return logger;
    }
}