package hw24;

class FileMaxSizeReachedException extends Exception {
    public FileMaxSizeReachedException(String message) {
        super(message);
    }
}