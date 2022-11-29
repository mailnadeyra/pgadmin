//
//import java.lang.reflect.Array;
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Stack r = new Stack();
//        r.push("23");
//        System.out.println(r);
//        r.empty();
//        System.out.println(r);
//        r.push("78");
//        System.out.println(r);
//        r.pop();
//        System.out.println(r);
//    }
//}
////        r.add("Venkat");
////
////        System.out.println(r);
////        r.add("divya");
////        System.out.println(r);
////        r.add(5);
////        System.out.println(r);
////        r.addAll(1,r);
////        System.out.println(r);
////        System.out.println(r.contains("rizwana"));
////        System.out.println(r.isEmpty());
////        System.out.println(r.size());
////        r.remove("divya");
////
////    }
////}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        for(int i=0;i<=10;i++)
        {
            l.add(i);


        }
        System.out.println(l);
        Iterator itr= l.iterator();
        while(itr.hasNext()) {
            Integer I = (Integer) itr.next();
            if (I % 2 == 0)

                System.out.println(I);
            else
                itr.remove();
        }
        System.out.println(l);


        }
    }

