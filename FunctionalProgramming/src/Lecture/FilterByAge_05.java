import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterByAge_05 {
    public static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Function<Scanner, Person> readPerson = sc -> {
            String[] data = scanner.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            return new Person(name, age);
        };

        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            Person p = readPerson.apply(scanner);
            people.add(p);
        }


        String condition = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String printFilter = scanner.nextLine();

        Predicate<Person> filter = getCondition(condition, ageFilter);
        Consumer<Person> printer = getPrinter(printFilter);

        people.stream().filter(filter).forEach(printer);
    }

    private static Consumer<Person> getPrinter(String filter) {
        switch (filter) {
            case "name":
                return p -> System.out.println(p.name);
            case "age":
                return p -> System.out.println(p.age);
            case "name age":
                return p -> System.out.println(p.name + " - " + p.age);
            default:
                throw new IllegalArgumentException("Unknown condition");
        }
    }

    private static Predicate<Person> getCondition (String condition, int age) {
        switch (condition) {
            case "older":
               return p -> p.age >= age;

            case "younger":
                return p -> p.age <= age;
            default:
                throw new IllegalArgumentException("Unknown condition");
        }

    }
}
