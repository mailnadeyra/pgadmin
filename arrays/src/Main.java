//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Student s[] = new Student[3];
//        for (int i = 1; i < 3; i++) {
//            System.out.println("enter student details");
//
//            Student newstudent = new Student(sc.nextDouble(), sc.next(), sc.next(), sc.nextDouble());
//
//
//            s[i] = newstudent;
//
//    }
//
//    for(int i=0;1<3;i++)
//    {
//        System.out.println(s[i]);
//    }
//
//
//
//    }


import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l= new ArrayList();
        l.add("A");
        l.add(10);
        l.add(null);
        l.add("ladu");
        System.out.println(l);

        //ArrayList<String> a=new ArrayList<>();
        l.add("ram");
//l.add("Apple","berry");
        System.out.println(l);
        // l.addAll("ram","jani")

        l.remove(null);
        System.out.println(l);
        l.contains("ram");

        // l.isEmpty();
        //System.out.println(l.contains(11));











        // l.remove(10);
        //  System.out.println(l);
    }

