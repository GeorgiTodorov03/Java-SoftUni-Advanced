package JarOfT_01;

public class Main {
    public static void main(String[] args) {

        Jar<String> jar = new Jar<>();

        jar.add("Pesho");
        jar.add("Gosho");

        Jar<Integer> intJar = new Jar<>();

        intJar.add(13);
        intJar.add(42);
    }
}
