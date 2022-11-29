public class Main
{

    public static void main(String[] args)
    {
    bank b=new bank(123,321,54533,788,89898,7678);
        bank a=new bank(134,35768,89893,908,2345,90878);
        System.out.println("The Bank A Details are");

        System.out.println(b.getWithdraw()+"\n"+b.getLoan()+"\n"+"\n"+b.getDeposit()+"\n"+"\n"+b.getPassbook()+"\n"+"\n"+b.getCredit()+"\n"+"\n"+b.getDebit());
        System.out.println("The Bank B Details are");
        System.out.println(a.getWithdraw()+"\n"+a.getLoan()+"\n"+"\n"+a.getDeposit()+"\n"+"\n"+a.getPassbook()+"\n"+"\n"+a.getCredit()+"\n"+"\n"+a.getDebit());

    }
}