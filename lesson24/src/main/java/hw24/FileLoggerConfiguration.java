package hw24;

class FileLoggerConfiguration {
    private String file;
    private LoggingLevel loggingLevel;
    private long maxSize;
    private String format;

    public FileLoggerConfiguration(String file, LoggingLevel loggingLevel, long maxSize, String format) {
        this.file = file;
        this.loggingLevel = loggingLevel;
        this.maxSize = maxSize;
        this.format = format;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public void setLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(long maxSize) {
        this.maxSize = maxSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

