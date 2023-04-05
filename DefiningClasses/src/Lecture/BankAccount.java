public class BankAccount {
    private static int nextId = 1;
    public BankAccount() {
        this.id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }
    private static double interestRate = 0.02;
    private int id;
    private double balance;


    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {
        return balance * years * interestRate;
    }
    public void deposit (double amount) {
        this.balance += amount;
    }
}
