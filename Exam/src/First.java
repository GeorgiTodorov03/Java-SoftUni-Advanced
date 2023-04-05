import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> totalCaffeine = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(totalCaffeine::push);

        ArrayDeque<Integer> energyDrinks = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int initialCaffeine = 0;

        while (!totalCaffeine.isEmpty() && !energyDrinks.isEmpty()) {
            int caffeine = totalCaffeine.peek();
            int drink = energyDrinks.peek();
            int sum = 0;

            sum = caffeine * drink;

            if (sum + initialCaffeine <= 300) {
                initialCaffeine += caffeine * drink;
            } else {
                energyDrinks.offer(drink);
                initialCaffeine -= 30;
                if (initialCaffeine < 0) {
                    initialCaffeine = 0;
                }
            }

            totalCaffeine.pop();
            energyDrinks.poll();

        }

        if (energyDrinks.isEmpty()) {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        } else {
            System.out.print("Drinks left: ");
            for (Integer energyDrink : energyDrinks) {
                if (energyDrinks.size() > 1) {
                    System.out.print(energyDrink + ", ");
                } else {
                    System.out.println(energyDrink);
                }
                energyDrinks.poll();
            }

        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.", initialCaffeine);

    }
}