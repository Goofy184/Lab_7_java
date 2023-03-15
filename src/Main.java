import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<String> channels = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        channels.add("1+1");
        channels.add("ICTV");
        channels.add("STB");
        channels.add("Новий канал");
        channels.add("ТЕТ");
        channels.add("К1");
        channels.add("Інтер");
        channels.add("Культура");
        channels.add("UA:Перший");
        channels.add("UA");
        System.out.println("TV Channels: " + channels);
        testGettingElement(channels, scanner);
        testRemovingElement(channels, scanner);
    }
    private static void testGettingElement(List<String> channels, Scanner scanner) {
        System.out.print("Введіть номер телеканалу для пошуку: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < channels.size()) {
            String channel = channels.get(index);
            System.out.println("Телеканал з номером " + index + ": " + channel);
        } else {
            System.out.println("Телеканал з номером " + index + " не знайдено.");
        }
    }
    private static void testRemovingElement(List<String> channels, Scanner scanner) {
        System.out.print("Введіть номер телеканалу для видалення: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < channels.size()) {
            String removedChannel = channels.remove(index);
            System.out.println("Видалено телеканал з номером " + index + ": " + removedChannel);
        } else {
            System.out.println("Телеканал з номером " + index + " не знайдено.");
        }
        scanner.close();
        System.out.println("TV Channels: " + channels);
    }
}