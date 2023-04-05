import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> savedEmails = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile("[.](?:[c][o][m]|[u][k]|[u][s])$", Pattern.CASE_INSENSITIVE);

        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();

            Matcher matcher = pattern.matcher(email);

            if (!matcher.find()){
                savedEmails.put(name, email);

            }

            input = scanner.nextLine();
        }

        for (var entry : savedEmails.entrySet()) {
            System.out.printf("%s -> %s%n",entry.getKey(), entry.getValue());
        }
    }
}
