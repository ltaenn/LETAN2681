package letan_2681.Lec10_Encapsulation.Abstract.Exercise9;

public abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract String getAccountType();

    public void display() {
        System.out.println("Loại tài khoản: " + getAccountType());
        System.out.println("Số dư: $" + balance);
    }
}
