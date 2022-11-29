import java.util.*;
public class Hdfc implements IAccount
{
    int deposit;
    int withdraw;
 public int getDeposit() {
       return deposit-withdraw;
    }

    public void setDeposit(int deposit) {
        System.out.println("The deposit value is");
        this.deposit = deposit;
    }

    public int getWithdraw() {
        System.out.println("The withdrawal amount is");
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public void print1()
    {
        System.out.println("The amount is printed which is available in Hdfc Account");
    }

    @Override
    public void getbablance() {

    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }
}