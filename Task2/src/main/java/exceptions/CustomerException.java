package exceptions;

/**
 * Исключение несовпадения покупателя
 */
public class CustomerException extends RuntimeException{
    public CustomerException() {
        super("Buyer not found.");
    }
}
