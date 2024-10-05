package exceptions;

/**
 * Исключение логина
 */
public class WrongLoginException extends RuntimeException{

    public WrongLoginException() {
        super("Login is incorrect.");
    }

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException(String login, int expectedLength) {
        super(String.format("Your login is incorrect. Length must be not over %d symbols. Your login has %d symbols.", expectedLength, login.length()));
    }
}
