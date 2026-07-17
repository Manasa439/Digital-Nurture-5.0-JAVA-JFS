public class Logger {

    // Create a single instance of Logger
    private static Logger instance = new Logger();

    // Private constructor
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Public method to return the same instance
    public static Logger getInstance() {
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}