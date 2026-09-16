package letan_2681.Lec10_Encapsulation.Abstract.Exercise9;

public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
