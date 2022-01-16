package example1;

public class Doctor extends Person{
    Double bonus;

    public Doctor(String firstName, String lastName, Double salary, Double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
