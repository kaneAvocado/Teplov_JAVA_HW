public class SwitchTypesExample {
    public static void main(String[] args) {
        int choice = 2;
        char grade = 'B';
        String dayOfWeek = "Понедельник";

        switch (choice) {
            case 1:
                System.out.println("Выбрано целое число 1");
                break;
            case 2:
                System.out.println("Выбрано целое число 2");
                break;
            default:
                System.out.println("Выбор не распознан");
        }

        switch (grade) {
            case 'A':
                System.out.println("Оценка 'A'");
                break;
            case 'B':
                System.out.println("Оценка 'B'");
                break;
            default:
                System.out.println("Неудовлетворительно");
        }

        switch (dayOfWeek) {
            case "Понедельник":
                System.out.println("Понедельник");
                break;
            case "Среда":
                System.out.println("Среда");
                break;
            default:
                System.out.println("Другой день недели");
        }
    }
}
