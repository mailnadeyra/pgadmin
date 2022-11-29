import java.util.*;
public class ArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList l=new ArrayList();
        l.add("A");
        l.add(10);
        l.add(null);
        l.add("apple");
        l.add("laddu");
//        l.addAll(2);
        l.remove(null);
        l.contains("banana");
//        l.retainAll();
        l.isEmpty();
        System.out.println(l.isEmpty());
        l.contains(12);
        System.out.println(l.contains(10));
//        l.addAll(l);
//        System.out.println(l.addAll(5,l));




        System.out.println(l);
    }
}

