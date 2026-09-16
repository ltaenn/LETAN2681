package letan_2681.Lec10_Encapsulation.Abstract.Exercise2;

public class Processor_Ex2 {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Nguyen Van A", 15000000);
        emp.displayInfo();
        System.out.println("Lương: " + emp.calculateSalary() + " VND");
    }
}
