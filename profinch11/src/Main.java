////public class Main
////{
////
////    public static void main(String[] args)
////    {
////        Student s1=new Student();
////        Student s2=new Student();
////        s1.id=123;
////        s1.name="Rizwana";
////        s1.address="vijayawada";
////        s1.contact=5467;
////        s1.displaystudent();
////
////    }
////}
//class  main{
//
//    public static void main(String[] s) {
//        IAccount a = new Hdfc();
//
//        System.out.println("Transactiondetails of Hdfc Bank");
//        transaccount(a);
//        System.out.println();
//
//        a = new State();
//
//        System.out.println("Transaction Details of State Bank");
//        transaccount(a);
//    }
//
//    public static void transaccount(IAccount a) {
//
//        a.deposit(90000);
//        printBalance("deposit 90000", a);
//        a.withdraw(80000);
//        printBalance("withdraw,80000" , a);
//        a.withdraw(7966);
//        printBalance("withdraw 7966", a);
//        a.deposit(556789);
//        printBalance("deposit 556789", a);
//
//    }
//
//    public static void printBalance(String message, IAccount a) {
//        System.out.println("The balance after " + message + " is " + a.getBalance() + ".");
//    }
//
//}
//
//interface IAccount {
//    int getBalance();
//
//    void deposit(int amount);
//
//    void withdraw(int amount);
//}
//
//class Hdfc implements IAccount {
//    int deposits;
//    int withdrawals;
//
//
//    public int getBalance() {
//        return deposits - withdrawals;
//    }
//
//    public void deposit(int amount) {
//        deposits += amount;
//    }
//
//    public void withdraw(int amount) {
//        withdrawals += amount;
//    }
//}
//
//class State implements IAccount {
//    int balance;
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void deposit(int amount) {
//        balance += amount;
//    }
//
//    public void withdraw(int amount) {
//        balance -= amount;
//    }
//}