/**
 * @author Simon
 */
public class Faculty {
    final private String name;
    final private int id;
    private String job;
    private double salary;
    private boolean status;


    public Faculty(String name, int id, String job, double salary) {
        this.name = name;
        this.id = id;
        this.job = job;
        this.salary = salary;
        this.status = true;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getStatus() {
        return status;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void changeStatus() {
        status = !status;
    }

}
