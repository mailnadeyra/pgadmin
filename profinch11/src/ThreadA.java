//public class ThreadA
//{
//    public static void main(String args[]) throws InterruptedException
//    {
//        ThreadB b=new ThreadB();
//        b.start();
//        Thread.sleep(10000);
//        synchronized (b)
//        {
//            System.out.println("calling main method");
//            b.wait(10000);
//            System.out.println("main thread get notification");
//            System.out.println(b.total);
//        }
//    }
//}
//class ThreadB extends Thread
//{
//    int total=0;
//    public void run()
//    {
//        synchronized (this) {
//            System.out.println("child treats start calculation");
//            for (int i = 1; i <=10; i++)
//            {
//                total=total+1;
//
//            }
//            System.out.println("child thread giving notification");
//            this.notify();
//        }
//    }
//}
