package ro.fastrackit.homework7;

public class InvalidPasswordException extends Exception {

    private String message;

    public InvalidPasswordException(String message) {
        super(message);
        this.message = message;
    }
}
