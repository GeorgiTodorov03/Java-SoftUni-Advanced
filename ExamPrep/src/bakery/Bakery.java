package bakery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bakery {

    private String name;
    private int capacity;
    private List<Employee> employees;


    public Bakery (String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        employees = new ArrayList<>();
    }

    public void add(Employee e) {
        if (employees.size() < capacity) {
            employees.add(e);
        }
    }

    public boolean remove(String name) {
        return employees.removeIf(n -> n.getName().equals(name));
    }

    public Employee getOldestEmployee() {
        return Collections.max(employees, Comparator.comparingInt(Employee::getAge));
    }

    public Employee getEmployee(String name) {
        return employees.stream()
                .filter(n -> n.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Employees working at Bakery %s:%n", name));

        for (Employee employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
