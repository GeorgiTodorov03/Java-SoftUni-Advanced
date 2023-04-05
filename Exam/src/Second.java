import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String carNumber = scanner.nextLine();

        int racerRow = 0;
        int racerCol = 0;

        String[][] raceTrack = new String[size][size];
        for (int rows = 0; rows < size; rows++) {
            String[] row = scanner.nextLine().split(" ");
            raceTrack[rows] = row;
        }

        int kmPassed = 0;
        String command = scanner.nextLine();
        
        while (!command.equals("End")) {
            
            if (command.equals("up")) {
                racerRow--;
            } else if (command.equals("down")) {
                racerRow++;
            } else if (command.equals("left")) {
                racerCol--;
            } else if (command.equals("right")) {
                racerCol++;
            }

             if (raceTrack[racerRow][racerCol].equals(".")){
                kmPassed += 10;
            }
             if (raceTrack[racerRow][racerCol].equals("T")) {
                raceTrack[racerRow][racerCol] = ".";

                int tunnelCol = 0;
                int tunnelRow = 0;
                for (int rows = 0; rows < size; rows++) {
                    for (int cols = 0; cols < size; cols++) {
                        if (raceTrack[rows][cols].equals("T")) {
                            tunnelCol = cols;
                            tunnelRow = rows;
                            break;
                        }
                    }
                }


                racerRow = tunnelRow;
                racerCol = tunnelCol;
                raceTrack[racerRow][racerCol] = ".";

                kmPassed += 30;
            }
            if (raceTrack[racerRow][racerCol].equals("F")) {
                kmPassed += 10;
                System.out.printf("Racing car %s finished the stage!%n", carNumber);
                break;
            }



            command = scanner.nextLine();
        }

        if (command.equals("End")) {
            System.out.printf("Racing car %s DNF.%n", carNumber);
        }

        System.out.printf("Distance covered %d km.%n", kmPassed);

        raceTrack[racerRow][racerCol] = "C";
        for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
             System.out.print(raceTrack[i][j]);
         }
            System.out.println();
        }

    }
}
