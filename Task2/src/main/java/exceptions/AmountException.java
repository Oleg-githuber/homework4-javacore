package exceptions;

/**
 * Исключение количества товаров
 */
public class AmountException extends RuntimeException{
    public AmountException() {
        super("Incorrect value of quantity.");
    }
}
