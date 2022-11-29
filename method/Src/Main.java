//public class Main {
//
// public static void main(String[] args) {
//
//        System.out.println(addition.add(20,20));
//        System.out.println(addition.add(20,20,20));
//        System.out.println(addition.add(20,0,20));


import org.w3c.dom.ls.LSOutput;

//public class Main {
//
//    public static void main(String[] args) {
//        Address address1=new Address("bang","ap","india");
//        Address address2=new Address("canada","up","india");
//        Address address3=new Address("vjy","kp","india");
//        employee e1=new employee(12,"Rizwana",address1);
//        employee e2=new employee(23,"venkat",address2);
//        e1.display();
//        e2.display();
//
//
//    }
//
//}
//public class Main {
//
//    public static void main(String[] args) {
//        Bike b = new Honda();
//        b.changergear();
//        b.run();
//
//    }
//}
//public class Main extends Emp {
//    int bonus=1000000;
//    public static void main(String[] args)
//    {
//        Main m=new Main();
//        System.out.println("employee normal salary"+m.salary);
//        System.out.println("employee salary and bonus"+(m.salary+m.bonus));
//    }
//
//
//}
//public class Main {
//    public static void main(String []args) {
//
//        A obj = new A();
//        obj.print();
//        obj.arithmetic();
//        obj.show();
//        obj.msg();
//    }
//}
//

//    public class Main {
//        public static void main(String[] args) {
//
//
//            Hdfc a=new Hdfc();
//
//
//
//
//
//            a.deposit(123);
//            a.withdraw(3000);
//            a.getbablance();
//            System.out.println("the state bank details is" );
//
//
//            State b=new State();
//            System.out.println();
//
//            b.deposit(9000);
//            b.withdraw(3000);
//            b.getbablance();
//            System.out.println("The Hdfc bank details is");
//
//
//        }
//    }
//public static void main(String[]args)
//        {
//            IAccount Account=new  Hdfc();
//            System.out.println("The Hdfc bank details are");
//            transactAccount(Account);
//            System.out.println("Transaction is done");
//
//        }
//public static void transactAccount(IAccount account) {
//
//       Account.deposit(1000);
//        printBalance("depositing 10,000.0", Account);
//        Account.withdraw(2500.0);
//
//        Account.withdraw(4100.0);
//        printBalance("withdrawing 4,100.0", Account);
//        Account.deposit(5000.0);
//
//
//        }
//






//public class Main {
//    public static void main(String[] args) {
//        Vehicle.working();
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Account ac = new Account("rizwana",101,453564,5000000.50f);
//        ac.interest();
//    }
//}
//
//public class Main {
//    static int age;
//
//    static void validate(int age )throws  InvalidAgeException {
//
//
//        if (age < 18) {
//            throw new InvalidAgeException("NOT ALIGIBLE TO VOTE");
//        } else
//            System.out.println("welcome to vote");
//        }
//        public static void main (String [] args){
//            try {
//                validate(16);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//
//    }
//public class Main {public static void main(String args[])
//{
//
//    }
//}
class Main {
    public static void main(String[] s) {
        IAccount account = new HDFCAccount();

        System.out.println("Transacting using HDFC Account");
        transactAccount(account);
        System.out.println();

        account = new StateBankAccount();

        System.out.println("Transacting using State Bank Account");
        transactAccount(account);
    }

    public static void transactAccount(IAccount account) {

        account.deposit(10000.0);
        printBalance("depositing 10,000.0", account);
        account.withdraw(2500.0);
        printBalance("withdrawing 2,500.0", account);
        account.withdraw(4100.0);
        printBalance("withdrawing 4,100.0", account);
        account.deposit(5000.0);
        printBalance("depositing 5,000.0", account);

    }

    public static void printBalance(String message, IAccount account) {
        System.out.println("The balance after " + message + " is " + account.getBalance() + ".");
    }

}

interface IAccount {
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);
}

class HDFCAccount implements IAccount {
    double deposits;
    double withdrawals;


    public double getBalance() {
        return deposits - withdrawals;
    }

    public void deposit(double amount) {
        deposits += amount;
    }

    public void withdraw(double amount) {
        withdrawals += amount;
    }
}

class StateBankAccount implements IAccount {
    double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}