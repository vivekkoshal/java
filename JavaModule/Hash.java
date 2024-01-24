package JavaModule;

import java.util.*;
public class Hash {
    public static void main(String[] args) {
        HashMap<Integer ,String> hs = new HashMap<Integer ,String>();
        hs.put(1 , "vivek");
        hs.put(3 , "garvit");
        hs.put(2 , "dhaka");
        System.out.println(hs.get(1));
        System.out.println(hs.get(3));

        Iterator<Integer> it = hs.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



        HashMap<String ,String> bandi = new HashMap<String , String>();
        bandi.put("garvit" , "Pranjal");
        bandi.put("utsav" , "khushi");
        bandi.put("dahaka" , "toshi") ;
        bandi.put("vivek" ,"Anamika/Sukriti");

        System.out.println(bandi.get("utsav"));

        System.out.println("yaha pr itrator ha");

        Iterator<String> bit = bandi.keySet().iterator();
        while (bit.hasNext()){
            String temp = bit.next();
            System.out.println(temp + "->" + bandi.get(temp));
        }





    }
}
