package RawData_04;

public class Car {
    private static final int tires_count = 4;
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires = new Tire[tires_count];


    public Car (String[] data) {
        int counter = -1;
        this.model = data[++counter];
        this.engine = new Engine(
        /*speed*/    Integer.parseInt(data[++counter]),
        /*power*/    Integer.parseInt(data[++counter]));
        this.cargo = new Cargo(Integer.parseInt(data[++counter]),
        data[++counter]);
        for (int i = 0; i < tires_count; i++) {
            this.tires[i] = new Tire(Double.parseDouble(data[++counter]),
                    Integer.parseInt(data[++counter]));
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tire[] getTires() {
        return tires;
    }
    public String toString() {
        return this.model;
    }
}
