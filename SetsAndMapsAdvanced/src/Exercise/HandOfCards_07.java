import java.util.*;

public class HandOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!command.equals("JOKER")) {
            String[] parts = command.split(": ");
            String name = parts[0];

            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());
            }
            String[] cards = parts[1].split(", ");
            Collections.addAll(players.get(name), cards);


            command = scanner.nextLine();
        }

        for (var player : players.entrySet()) {
            String name = player.getKey();
            int points = calculatePoints(player.getValue());
            System.out.printf("%s: %d%n", name, points);
        }
    }

    private static int calculatePoints(Set<String> cards) {
        int points = 0;

        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String color = card.substring(card.length() - 1);

            points += getPower(power) * getColor(color);
        }

        return points;
    }

    private static int getColor(String color) {
        switch (color) {
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
        }
        return 0;
    }

    private static int getPower(String power) {
        try {
            int intPower = Integer.parseInt(power);
            return intPower;
        } catch (Exception e) {
            switch (power) {
                case "J":
                    return 11;
                case "Q":
                    return 12;
                case "K":
                    return 13;
                case "A":
                    return  14;
            }
        }
        return 0;
    }
}
