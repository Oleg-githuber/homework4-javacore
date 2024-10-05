/**
 * Класс - покупатель
 */
public class Buyer {
    private String lastName;    // Фамилия
    private String firstName;   // Имя
    private String secondName;  // Отчество

    private int age;    // Возраст
    private String phoneNumber;     // Номер телефона

    /**
     * Пол м/ж
     */
    public static enum Gender{
        MALE("Sex: Male"), FEMALE("Sex: Female");
        private String message;
        Gender(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    private Gender gender;  // Пол м/ж

    public Buyer(String lastName, String firstName, String secondName, int age, String phoneNumber, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public String getGenderString() {
        return gender.getMessage();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", lastName, firstName, secondName);
    }
}
