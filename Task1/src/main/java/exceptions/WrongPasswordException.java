package exceptions;

/**
 * Исключение пароля
 */
public class WrongPasswordException extends RuntimeException{

    public WrongPasswordException() {
        super("Password is incorrect.");
    }


    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException(String password, int expectedLength) {
        super(String.format("Your password is incorrect. Length must be not over %d symbols. Your password has %d symbols.", expectedLength, password.length()));
    }

}
