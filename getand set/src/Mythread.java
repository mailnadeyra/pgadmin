// class Mythread1 extends Thread{
//
//
//    }
//    public class Mythread
//    {
//        public static void main(String args[])
//        {
//            System.out.println(Thread.currentThread().getPriority());
//            Mythread1 t=new Mythread1();
//            Mythread1 t1=new Mythread1();
//
//            System.out.println(t.getName());
//            t.setName("Rizwana");
//            System.out.println(t.getName());
//            System.out.println(t1.getName());
//            Thread.currentThread().setName("java");
//
//        }
//    }

//class Mythread1 extends Thread{
//
//
//}
//public class Mythread {
//    public static void main(String args[]) {
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());
//    }
//}
class Mythread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println("The solusion is");
            }
            Thread.yield();
        }
    }
}

public class Mythread {


    public static void main(String args[]) throws InterruptedException {
        {
            Mythread1 t = new Mythread1();


            t.start();
            t.join(233);
            for (int i = 0; i < 10; i++) {
                System.out.println("main");
            }
        }
    }
}



