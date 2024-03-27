import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int lettersCount = countMatch(text, "\\p{L}");
        int digitsCount = countMatch(text, "\\d");
        int punctuationCount = countMatch(text, "\\p{P}");
        int whitespaceCount = countMatch(text, "\\s");

        String[] words = text.split("\\s+");
        int wordsCount = words.length;

        System.out.println("Букви: " + lettersCount);
        System.out.println("Цифри: " + digitsCount);
        System.out.println("Розділові знаки: " + punctuationCount);
        System.out.println("Пробельні символи: " + whitespaceCount);
        System.out.println("Слова: " + wordsCount);
    }

    private static int countMatch(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

}
