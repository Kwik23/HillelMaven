package hw24;

public class Main {
    public static void main(String[] args) {
        FileLoggerConfigurationLoader loader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration configuration = loader.load("config.txt");
        FileLogger logger = new FileLogger(configuration);

        try {
            logger.info("Це повідомлення INFO");
            logger.debug("Це повідомлення DEBUG");
        } catch (FileMaxSizeReachedException e) {
            e.printStackTrace();
        }
    }
}
