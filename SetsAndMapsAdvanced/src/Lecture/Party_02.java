import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Party_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();


        while (!input.equals("PARTY")) {
            boolean isVip = Character.isDigit(input.charAt(0));

            if (isVip) {
                vipGuests.add(input);
            } else {
                regularGuests.add(input);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("END")) {
            boolean isVip = Character.isDigit(input.charAt(0));
            if (isVip) {
                vipGuests.remove(input);
            } else {
                regularGuests.remove(input);
            }


            input = scanner.nextLine();
        }

        System.out.println(vipGuests.size() + regularGuests.size());

        for (String v : vipGuests) {
            System.out.println(v);
        }
        for (String r : regularGuests) {
            System.out.println(r);
        }
    }
}
