/**
 * @author Simon
 */
public class Student {
    private String name;
    private int id;
    private double balance;
    private boolean status;

    // Constructor
    public Student (String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        status = true;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public boolean getStatus() {
        return status;
    }

    public void payment(double amount) {
        balance -= amount;
    }

    public void charge(double amount) {
        balance += amount;
    }

    public void changeStatus() {
        status = !status;
    }


}
