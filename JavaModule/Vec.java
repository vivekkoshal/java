package JavaModule;

import java.util.Collections;
import java.util.Iterator;
import java.util.*;
import java.io.File;

public class Vec {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<Integer>();
        vc.add(1);
        vc.add(2);
        vc.add(4);
        vc.add(7);
        Collections.sort(vc);
        System.out.println( vc.get(2));
        for (int i = 0; i < vc.size(); i++) {
            System.out.print(vc.get(i)+" ");

        }
       // System.out.println(vc.capacity());
        vc.add(2, 99);

        System.out.println(vc);
        System.out.println(vc);
        Collections.reverse(vc);

        System.out.println(vc);
        Collections.sort(vc);            //Collections library is OP

        Iterator<Integer> it = vc.iterator(); //iterator doesnot makes a new object it just uses the defined object to itrate on it


        System.out.println(it.hasNext()); //haNext() only return boolena ki uske age koi no. ha ya nahi ye itrator ke pointer ko age nahi bhadata
        System.out.println(it.hasNext());
        System.out.println(it.hasNext());
        System.out.println(it.hasNext());
        System.out.println(it.hasNext());
        System.out.println(it.hasNext());

//        System.out.println(it.next()); //next itrator ki value return karke itrator ke pointer ko age bhada deta ha
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());

//        Collections.reverse(vc);
//
//        while (it.hasNext()){  //itrator age jane ke bad piche nahi aatat
//            System.out.println(it.hasNext());
//            System.out.println(it.next());
//        }
        File file = new File("");
        String s = file.getAbsolutePath();
        System.out.println(s);










    }

}
