package example1;

public class Nurse extends Person{
    double overtime;

    public Nurse(String firstName, String lastName, Double salary, double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
