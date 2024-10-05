public class Main {
    public static void main(String[] args) {
        final Buyer[] buyers = MyConstants.buyers;
        final Product[] products = MyConstants.products;
        final int arraySize = MyConstants.arraySize;
        final int maxQuantity = MyConstants.maxQuantity;
        Order[] orders =new Order[arraySize];
        System.out.printf("Orders made: %d%n%n", OrderCreator.counter);
        for (int i = 0; i < arraySize; ++i) {
            System.out.printf("%s is making the order for %d of %s.%n", MyConstants.buyerNames[i], MyConstants.quantity[i], MyConstants.productsNames[i]);
            orders[i] = OrderCreator.buy(MyConstants.buyerNames[i], MyConstants.productsNames[i], MyConstants.quantity[i], maxQuantity, buyers, products);
            if (orders[i].getProduct() != null) {
                System.out.printf("%s made order for %d of %s.%n", orders[i].getBuyer().toString(), orders[i].getQuantity(), orders[i].getProduct().getName());
                OrderCreator.counter++;
            }
            System.out.printf("Orders made: %d%n%n", OrderCreator.counter);
        }
    }
}
