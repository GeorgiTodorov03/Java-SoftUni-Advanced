import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parking = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] info = input.split(", ");
            String direction = info[0];
            String carNumber = info[1];

            if (direction.equals("IN")) {
                parking.add(carNumber);

            } else {
                parking.remove(carNumber);

            }
            input = scanner.nextLine();
        }

        String output = parking.isEmpty()
                ? "Parking Lot is Empty"
                : String.join(System.lineSeparator(), parking);

        System.out.println(output);

        }
    }

