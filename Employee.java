package letan_2681.Lec10_Encapsulation.Abstract.Exercise2;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Tên nhân viên: " + name);
    }

    public abstract double calculateSalary();
}
