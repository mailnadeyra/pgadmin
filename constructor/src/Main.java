public class Main {
    public static void main(String[] args) {
        box mybox1 = new box();
        box mybox2 = new box(3,4,6);
        box mybox3 = new box(6,7);
        box mybox4 = new box(mybox2);
        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mybox3.volume());
        System.out.println(mybox4.volume());


    }
}