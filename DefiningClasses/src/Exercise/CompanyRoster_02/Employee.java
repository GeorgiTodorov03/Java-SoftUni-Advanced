package CompanyRoster_02;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String mail;
    private int age;

    public Employee(String name, double salary, String position, String department, String mail, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.mail = mail;
        this.age = age;
    }

    public Employee (String name, double salary, String position, String department, String mail) {
        this(name, salary, position, department, mail, -1);
    }
    public Employee (String name, double salary, String position, String department, int age) {
        this(name, salary, position, department, "n/a", age);
    }

    public Employee (String name, double salary, String position, String department) {
        this(name, salary, position, department, "n/a", -1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return String.format("%s %.2f %s %d", name, salary, mail, age);
    }
}
