
import java.util.*;
public class State implements IAccount
{
  int balance;

    public int getBalance() {
        return balance;
    }

    @Override
    public void getbablance() {

    }

    @Override
    public void deposit(int amount) {
        balance+=amount;

    }

    @Override
    public void withdraw(int amount) {

        balance-=amount;
    }
}



