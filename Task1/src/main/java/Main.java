import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your login: ");
        String login = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm your password: ");
        String confirmPassword = scanner.nextLine();
        try {
            System.out.printf("Result of checking is %s.", Boolean.toString(checkUserData(login, password, confirmPassword)));
        }
        catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    /**
     * Проверка данных пользователя
     * @param login логин
     * @param password пароль
     * @param confirmPassword подтверждение пароля
     * @return удачный результат
     */
    public static boolean checkUserData(String login, String password, String confirmPassword) {
        int expectedLoginLength = 20;
        int expectedPasswordLength = 20;
        boolean checking = false;

        try {
            checking = checkLogin(login, expectedLoginLength);
            checking &= checkPassword(password, expectedPasswordLength);
            checking &= checkMatchPassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException we) {
            System.out.println(we.getMessage());
            checking = false;
        }

        return checking;
    }

    /**
     * Проверка логина
     * @param login логин
     * @param expectedLength ожидаемая максимальная длина логина
     * @return
     */
    public static boolean checkLogin(String login, int expectedLength) {
        boolean result = true;
        if (login.length() >= expectedLength) {
            result = false;
            throw new WrongLoginException(login, expectedLength);
        }
        return result;
    }

    /**
     * Проверка длины пароля
     * @param password пароль
     * @param expectedLength максимальная длина пароля
     * @return
     */
    public static boolean checkPassword(String password, int expectedLength) {
        if (password.length() >= expectedLength) {
            throw new WrongPasswordException(password, expectedLength);
        }
        return true;
    }

    /**
     * Проверка совпадения пароля
     * @param password пароль
     * @param confirmPassword подтверждение пароля
     * @return
     */
    public static boolean checkMatchPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password is not match.");
        }
        return true;
    }
}
