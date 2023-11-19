public class Main {
    public static void main(String[] args) {
        double number1 = 3.14;
        double number2 = 2.26;

        // Находим минимум между number1 и number2
        System.out.println("Минимум: " + (number1 < number2 ? number1 : number2));

        // Вычисляем логическое выражение
        System.out.println((true && false) || (true && !false));

        int binaryNumber1 = 2; // 010
        int binaryNumber2 = 5; // 101

        // Побитовое И (AND)
        System.out.println("Побитовое И: " + (binaryNumber1 & binaryNumber2));

        // Побитовое ИЛИ (OR)
        System.out.println("Побитовое ИЛИ: " + (binaryNumber1 | binaryNumber2));

        // Побитовое исключающее ИЛИ (XOR)
        System.out.println("Побитовое XOR: " + (binaryNumber1 ^ binaryNumber2));

        // Побитовое отрицание (NOT)
        System.out.println("Побитовое NOT: " + Integer.toBinaryString(~binaryNumber2));

        // Сдвиг вправо (>>)
        System.out.println("Сдвиг вправо: " + (binaryNumber2 >> binaryNumber1));

        // Сдвиг вправо с заполнением нулями (>>>)
        System.out.println("Сдвиг вправо с заполнением нулями: " + (binaryNumber2 >>> binaryNumber1));

        // Сдвиг влево (<<)
        System.out.println("Сдвиг влево: " + (binaryNumber1 << binaryNumber2));
    }
}
