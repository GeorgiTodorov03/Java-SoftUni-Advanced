package GenericArrayCreator_02;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayCreator.<Integer>create(Integer.class, 5, 13);

        String[] strings = ArrayCreator.create(5, "Java");

        for (String string : strings) {
            System.out.println(string);
        }
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
