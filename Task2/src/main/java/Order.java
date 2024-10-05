/**
 * Класс-заказ
 */
public class Order {
    private Buyer buyer;    // Покупатель
    private Product product;    // Товар
    private int quantity;       // Количество товаров

    public Order(Buyer buyer, Product product, int quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
