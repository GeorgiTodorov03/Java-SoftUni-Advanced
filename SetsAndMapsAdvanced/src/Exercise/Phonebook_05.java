import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String number = input.split("-")[1];

            if (phonebook.containsKey(name)) {
                phonebook.put(name, number);
            }

            phonebook.putIfAbsent(name, number);


            input = scanner.nextLine();
        }

        String searchNames = scanner.nextLine();

        while (!searchNames.equals("stop")) {

            if (phonebook.containsKey(searchNames)) {
                System.out.println(searchNames + " -> " + phonebook.get(searchNames));
            } else {
                System.out.println("Contact " + searchNames + " does not exist.");
            }

            searchNames = scanner.nextLine();
        }
    }
}
