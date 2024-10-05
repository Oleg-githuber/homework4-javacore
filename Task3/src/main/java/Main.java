public class Main {
    public static void main(String[] args) {
        Employee[] employees = MyConstants.employees;
        for (Holiday holiday : Holiday.values()) {
            System.out.printf("%n%nToday is %s%n%n", holiday.getMessage());
            congratulations(employees, holiday);
        }
    }

    /**
     * Перечисление праздников
     */
    public static enum Holiday {
        NOT_A_HOLIDAY("usual day"), NEW_YEAR("New year"), FEBRUARY_23("motherland defender's day"), MARTH_8("women's day");

        private String message;

        Holiday(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    /**
     * Поздравить сотрудников
     * @param employees массив сотрудников
     * @param today праздник
     */
    public static void congratulations(Employee[] employees, Holiday today) {
        for (Employee employee : employees) {
            personalCongratulations(employee, today);
        }
    }

    /**
     * Поздравить конкретного сотрудника
     * @param employee сотрудник
     * @param today праздник
     */
    public static void personalCongratulations(Employee employee, Holiday today) {
        String message = String.format("Dear %s. Congratulations!%nHappy %s!%n", employee.toString(), today.getMessage());
        switch (today) {
            case NEW_YEAR:
                System.out.println(message);
                break;
            case FEBRUARY_23:
                if (employee.getGender() == Employee.Gender.MALE) {
                    System.out.println(message);
                }
                break;
            case MARTH_8:
                if (employee.getGender() == Employee.Gender.FEMALE) {
                    System.out.println(message);
                }
        }
    }
}
