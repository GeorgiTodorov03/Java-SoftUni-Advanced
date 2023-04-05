package CustomList_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        CustomList<String> list = new CustomList<>();
        while (!command.equals("END")) {
            String[] commandParts = command.split("\\s+");
            switch (commandParts[0]) {
                case "Add":
                    String elementAdd = commandParts[1];
                    list.add(elementAdd);
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(commandParts[1]);
                    list.remove(removeIndex);
                    break;
                case "Contains":
                    String containsElement = commandParts[1];
                    System.out.println(list.contains(containsElement));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);

                    list.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String greaterElement = commandParts[1];
                    System.out.println(list.countGreaterThan(greaterElement));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
            }


            command = scanner.nextLine();
        }
    }
}
