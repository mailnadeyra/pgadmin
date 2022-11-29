//public class Synchronise extends Thread {
//    static class ThreadDemo {
//        void printThreadDemo(int n) {
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(n * i);
//                try {
//                    Thread.sleep(400);
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            }
//
//        }
//    }
//
//    static class MyThread extends Thread {
//        ThreadDemo t;
//
//        MyThread(ThreadDemo t) {
//            this.t = t;
//        }
//
//        public void run() {
//            t.printThreadDemo(5);
//        }
//
//    }
//
//    static class MyThread2 extends Thread {
//        ThreadDemo t;
//
//        MyThread2(ThreadDemo t) {
//            this.t = t;
//        }
//
//        public void run() {
//            t.printThreadDemo(100);
//        }
//    }
//
//    class TestSynchronization1 {
//        public static void main(String args[]) {
//            ThreadDemo obj = new ThreadDemo();
//            MyThread t1 = new MyThread(obj);
//            MyThread2 t2 = new MyThread2(obj);
//            t1.start();
//            t2.start();
//        }
//    }
//}
//
