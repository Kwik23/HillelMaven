package hw24;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String file = null;
            LoggingLevel loggingLevel = null;
            long maxSize = 0;
            String format = null;

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    switch (key) {
                        case "FILE":
                            file = value;
                            break;
                        case "LEVEL":
                            loggingLevel = LoggingLevel.valueOf(value);
                            break;
                        case "MAX-SIZE":
                            maxSize = Long.parseLong(value);
                            break;
                        case "FORMAT":
                            format = value;
                            break;
                    }
                }
            }

            reader.close();
            return new FileLoggerConfiguration(file, loggingLevel, maxSize, format);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}

