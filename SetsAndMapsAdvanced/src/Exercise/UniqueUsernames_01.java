import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> usernames = new LinkedHashSet<>();

        while (n-- > 0) {
            String currentName = scanner.nextLine();
            usernames.add(currentName);

        }

        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
