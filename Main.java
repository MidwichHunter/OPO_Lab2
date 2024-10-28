import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для проверки на GUID:");
        String inputString = scanner.nextLine();

        // Регулярное выражение для проверки строки на соответствие GUID
        String guidRegex = "^(\\{)?[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}(\\})?$";

        // Проверка строки на соответствие шаблону
        if (Pattern.matches(guidRegex, inputString)) {
            System.out.println("Строка является GUID.");
        } else {
            System.out.println("Строка не является GUID.");
        }

        scanner.close();
    }
}