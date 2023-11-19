public class Main {
    public static void main(String[] args) {
        String sampleString = "Привет, Мир!";

        int length = sampleString.length();
        System.out.println("Длина строки: " + length);

        String newString = sampleString + " Добро пожаловать в Java!";
        System.out.println("Сцепленная строка: " + newString);

        String substring = sampleString.substring(7);
        System.out.println("Подстрока: " + substring);

        String upperCaseString = sampleString.toUpperCase();
        System.out.println("Верхний регистр: " + upperCaseString);

        String lowerCaseString = sampleString.toLowerCase();
        System.out.println("Нижний регистр: " + lowerCaseString);

        String replacedString = sampleString.replace("Мир", "Java");
        System.out.println("Замененная строка: " + replacedString);

        boolean containsWorld = sampleString.contains("Мир");
        System.out.println("Содержит 'Мир': " + containsWorld);

        int indexOfComma = sampleString.indexOf(",");
        System.out.println("Индекс ',': " + indexOfComma);

        String[] words = sampleString.split(" ");
        System.out.println("Разделено на слова: ");
        for (String word : words) {
            System.out.println("   - " + word);
        }

        String stringWithSpaces = "   Привет, мир!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Усеченная строка: " + trimmedString);
    }
}
