package hw24;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class FileLogger {
    private FileLoggerConfiguration configuration;
    private File logFile;
    private long currentSize;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
        this.logFile = new File(configuration.getFile());
        this.currentSize = logFile.length();
    }

    public void debug(String message) throws FileMaxSizeReachedException {
        if (configuration.getLoggingLevel() == LoggingLevel.DEBUG) {
            String logMessage = formatLogMessage("DEBUG", message);
            writeLog(logMessage);
        }
    }

    public void info(String message) throws FileMaxSizeReachedException {
        if (configuration.getLoggingLevel() == LoggingLevel.DEBUG ||
                configuration.getLoggingLevel() == LoggingLevel.INFO) {
            String logMessage = formatLogMessage("INFO", message);
            writeLog(logMessage);
        }
    }

    private String formatLogMessage(String level, String message) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        String format = configuration.getFormat();
        if (format == null) {
            format = "[ПОТОЧНИЙ_ЧАС]";
        }

        return "[" + formattedDateTime + "][" + level + "] Повідомлення: " + message;
    }


    private void writeLog(String logMessage) throws FileMaxSizeReachedException {
        try {
            if (currentSize + logMessage.length() > configuration.getMaxSize()) {
                createNewLogFile();
                currentSize = 0;
            }

            FileWriter fileWriter = new FileWriter(logFile, true);
            fileWriter.write(logMessage + "\n");
            fileWriter.close();

            currentSize += logMessage.length();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createNewLogFile() {
        String newFileName = "Log_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy-HH:mm")) + ".txt";
        logFile = new File(logFile.getParent(), newFileName);
    }
}

