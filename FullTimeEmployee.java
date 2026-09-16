package letan_2681.Lec10_Encapsulation.Abstract.Exercise2;

public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
