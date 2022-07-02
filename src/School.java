import java.util.ArrayList;

/**
 * @author Simon
 */
public class School {
    private ArrayList<Student> students;
    private ArrayList<Faculty> faculty;
    private double enrollmentFee;
    private double startingSalary;

    public School(double enrollmentFee, double startingSalary) {
        this.enrollmentFee = enrollmentFee;
        this.startingSalary = startingSalary;
    }

    public void addStudent(String name, int id) {
        Student s = new Student(name, id, enrollmentFee);
        students.add(s);
    }

    public void addFacultyMember(String name, int id, String job) {
        Faculty f = new Faculty(name, id, job, startingSalary);
        faculty.add(f);
    }

    public Student getStudent(int id) {
        for (Student student : students) {
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }

    public Faculty getFacultyMember(int id) {
        for (Faculty facultyMember : faculty) {
            if (id == facultyMember.getId()) {
                return facultyMember;
            }
        }
        return null;
    }

    public void setEnrollmentFee(double newFee) {
        enrollmentFee = newFee;
    }

    public void setStartingSalary(double newSalary) {
        startingSalary = newSalary;
    }

    public double getEnrollmentFee() {
        return enrollmentFee;
    }

    public double getStartingSalary() {
        return startingSalary;
    }

}
