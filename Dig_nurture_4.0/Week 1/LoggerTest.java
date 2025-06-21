public class LoggerTest {
    public static void main(String[] args) {
        System.out.println("Singleton Logger Test");

        Logger logger1 = Logger.getInstance();
        logger1.log("First log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message.");

        System.out.println("Are both instances the same? " + (logger1 == logger2));
    }
}