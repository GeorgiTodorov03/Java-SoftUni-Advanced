package GenericSwapInteger_04;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BoxSwap<Integer> box = new BoxSwap<>();
        for (int i = 0; i < n; i++) {
            Integer element = Integer.parseInt(scanner.nextLine());
            box.add(element);

        }

        String[] command = scanner.nextLine().split("\\s+");
        int firstIndex = Integer.parseInt(command[0]);
        int secondIndex = Integer.parseInt(command[1]);

        box.swap(firstIndex, secondIndex);
        System.out.println(box);
    }
}
