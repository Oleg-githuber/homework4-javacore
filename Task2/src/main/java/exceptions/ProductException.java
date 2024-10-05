package exceptions;

/**
 * Исключение несовпадения товара
 */
public class ProductException extends RuntimeException{
    public ProductException() {
        super("Product not found.");
    }
}
