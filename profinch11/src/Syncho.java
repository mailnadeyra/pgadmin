//class Display {
//    public synchronized  void wish(String name)
//    {
//        for(int i=0;i<10;i++)
//        {
//            System.out.println("good morning ");
//
//
//            try {
//                Thread.sleep(2000);
//            }
//            catch(InterruptedException e)
//            {
//
//            }
//            System.out.println(name);
//        }
//    }
//}
//class Mythread23 extends Thread{
//    Display d;
//    String name;
//    Mythread23(Display d,String name)
//    {
//        this.d=d;
//        this.name=name;
//    }
//    public void run(){
//        d.wish(name);
//    }
//}
//public class Syncho
//{
//    public static void main(String args[])
//    {
//        Display d=new Display();
//        Mythread23 t1=new Mythread23(d,"Rizwana");
//        Mythread23 t2=new Mythread23(d,"jani");
//        t1.start();
//        t2.start();
//
//    }
//}