/**
 * Мои константы
 */
public class MyConstants {

    public static int arraySize = 5;    // Размер массива

    public static final int maxQuantity = 100;  // Максимально возможное количество товаров в заказе

    // Массив покупателей
    public static final Buyer[] buyers = {
            new Buyer("Ivanov", "Ivan", "Ivanovich", 30, "111-111", Buyer.Gender.MALE),
            new Buyer("Petrov", "Petr", "Petrovich", 24, "222-222", Buyer.Gender.MALE)
    };

    // Массив товаров
    public static final Product[] products = {
            new Product("Product1", 100.0),
            new Product("Product2", 150.0),
            new Product("Product3", 200.0),
            new Product("Product4", 45.50),
            new Product("Product5", 99.99)
    };

    // Массив ФИО покупателей для создания заказа
    public static final String[] buyerNames = {
            "Ivanov Ivan Ivanovich",
            "Petrov Petr Petrovich",
            "Ivanov Ivan Ivanovich",
            "Petrov Petr Petrovich",
            "Stepanov Stepan Stepanovich"
    };

    // Массив наименований товаров для создания заказа
    public static final String[] productsNames = {
            "Product1",
            "Product2",
            "Product 3",
            "Product4",
            "Product5"
    };

    // Массив количества товаров для создания заказа
    public static final int[] quantity = {20, -30, 1, 150, 20};

    // Массив сотрудников для поздравлений
    public static final Buyer[] employees = {
            new Buyer("Ivanov", "Ivan", "Ivanovich", 30, "111-111", Buyer.Gender.MALE),
            new Buyer("Petrov", "Petr", "Petrovich", 24, "222-222", Buyer.Gender.MALE),
            new Buyer("Ivanova", "Anna", "Ivanovna", 17, "333-333", Buyer.Gender.FEMALE),
            new Buyer("Sidorov", "Sidor", "Sidorovich", 45, "444-444", Buyer.Gender.MALE),
            new Buyer("Sidorova", "Alina", "Alekseevna", 22, "555-555", Buyer.Gender.MALE)
    };
}
