package RawData_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Car car = new Car(scanner.nextLine().split(" "));
            cars.add(car);
        }

        String command = scanner.nextLine();

        switch (command) {
            case "fragile":
                cars.stream().filter(car -> car.getCargo().getType().equals("fragile") && Arrays.stream(car.getTires()).anyMatch(t -> t.getPressure() < 1))
                        .forEach(System.out::println);
                break;
            case "flamable":
                cars.stream().filter(car -> car.getCargo().getType().equals("flamable") && car.getEngine().getPower() > 250)
                        .forEach(System.out::println);
                break;
        }
    }
}
