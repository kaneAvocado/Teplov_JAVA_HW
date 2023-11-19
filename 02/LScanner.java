import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

import java.util.Scanner;

public class LScanner {
    public static void main(String[] args) {

        // Получаем текущую директорию
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current Directory: " + currentDirectory);

        try {
            // Открываем файл для чтения
            Scanner fileScanner = new Scanner(Paths.get("D:/example.txt"), StandardCharsets.UTF_8);

            // Пока есть следующее слово в файле
            while (fileScanner.hasNext()) {
                // Читаем следующее слово из файла
                String word = fileScanner.next();
                // Выводим слово на экран
                System.out.println("Word: " + word);
            }

        } catch (NoSuchFileException e) {
            // Обрабатываем исключение, если файл не найден
            System.out.println("Exception 1: File not found - " + e);
        } catch (IOException e) {
            // Обрабатываем другие исключения ввода/вывода
            System.out.println("Exception 2: I/O error - " + e);
        } catch (Exception e) {
            // Общий обработчик исключений
            System.out.println("Exception 3: " + e);
        }
    }
}
