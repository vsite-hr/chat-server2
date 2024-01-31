package hr.vsite.java.chatserver.exception;

public class GroupValidationException extends RuntimeException {

    public GroupValidationException(String message) {
        super(message);
    }

    public GroupValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
