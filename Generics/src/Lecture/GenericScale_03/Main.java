package GenericScale_03;

public class Main {
    public static void main(String[] args) {

        Integer left = 13;
        Integer right = 42;

        int i = left.compareTo(right);

        Scale<Integer> stringScale = new Scale<>(left, right);

        System.out.println(stringScale.getHeavier());
    }
}
