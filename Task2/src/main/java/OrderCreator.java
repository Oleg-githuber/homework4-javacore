import exceptions.AmountException;
import exceptions.CustomerException;
import exceptions.ProductException;

/**
 * Класс - создание заказа
 */
public class OrderCreator {

    public static int counter = 0;  // Счётчик заказов

    /**
     * Создать заказ
     * @param buyerName имя покупателя
     * @param productName наименование товара
     * @param quantity количество товара
     * @param maxQuantity максимальное количество товара
     * @param buyers массив существующих покупателей
     * @param products массив существующих товаров
     * @return
     */
    public static Order buy(String buyerName, String productName, int quantity, int maxQuantity, Buyer[] buyers, Product[] products) {
        Buyer buyer = null;
        Product product = null;
        buyer = chooseBuyer(buyers, buyerName);
        try {
            product = chooseProduct(products, productName);
        } catch (CustomerException | ProductException | AmountException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            checkQuantity(quantity, maxQuantity);
        } catch (CustomerException | ProductException | AmountException exception) {
            quantity = 1;
        }
        return new Order(buyer, product, quantity);
    }

    /**
     * Выбрать покупателя из массива
     * @param buyers массив существующих покупателей
     * @param buyerName ФИО покупателя
     * @return выбранный покупатель
     */
    public static Buyer chooseBuyer(Buyer[] buyers, String buyerName) {
        boolean doesBuyerExist = false;
        Buyer newBuyer = null;
        for (Buyer buyer : buyers) {
            if (buyerName.equals(buyer.toString())) {
                doesBuyerExist = true;
                newBuyer = buyer;
            }
        }
        if (!doesBuyerExist) {
            throw new CustomerException();
        }
        return newBuyer;
    }

    /**
     * Выбрать товары из массива
     * @param products массив существующих товаров
     * @param productName наименование товара
     * @return выбранный товар
     */
    public static Product chooseProduct(Product[] products, String productName) {
        boolean doesProductExist = false;
        Product newProduct = null;
        for (Product product : products) {
            if (productName.equals(product.getName())) {
                doesProductExist = true;
                newProduct = product;
            }
        }
        if (!doesProductExist) {
            throw new ProductException();
        }
        return newProduct;
    }

    /**
     * Проверка значения количества товаров
     * @param quantity количество
     * @param maxQuantity максимальное количество
     */
    public static void checkQuantity(int quantity, int maxQuantity) {
        if (quantity <= 0 || quantity > maxQuantity) {
            throw new AmountException();
        }
    }
}
