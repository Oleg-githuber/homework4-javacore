/**
 * Мои константы
 */
public class MyConstants {

    public static int arraySize = 5;    // Размер массива

    // Массив сотрудников для поздравлений
    public static final Employee[] employees = {
            new Employee("Ivanov", "Ivan", "Ivanovich", 30, "111-111", Employee.Gender.MALE),
            new Employee("Petrov", "Petr", "Petrovich", 24, "222-222", Employee.Gender.MALE),
            new Employee("Ivanova", "Anna", "Ivanovna", 17, "333-333", Employee.Gender.FEMALE),
            new Employee("Sidorov", "Sidor", "Sidorovich", 45, "444-444", Employee.Gender.MALE),
            new Employee("Sidorova", "Alina", "Alekseevna", 22, "555-555", Employee.Gender.MALE)
    };
}
