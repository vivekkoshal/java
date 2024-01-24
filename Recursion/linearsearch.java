package Recursion;

import java.util.ArrayList;
import java.util.List;

public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {2 , 5 , 3, 3, 3, 3, 1 ,9 ,0, 6, 7};
        int t = 3;

        System.out.println(line(arr ,t ,0));
       allfline(arr ,t ,0);
        System.out.println(List);
        System.out.println(allflineexp(arr , t, 0));

    }

    static boolean line (int[]arr , int t , int i){

        if(i == arr.length-1){
            return false;
        }

        return arr[i] == t || line(arr , t, i+1);
    }

    static int fline (int[]arr , int t , int i){

        if(i == arr.length-1){
            return -1;
        }

        if(arr[i] == t){
            return i;
        }

        return fline(arr , t, i+1);
    }

    static ArrayList<Integer> List = new ArrayList<>();

    static void allfline (int[]arr , int t , int i){
        if(i == arr.length){
            return ;
        }

        if(arr[i] == t){
           List.add(i);

        }
        allfline(arr, t, i + 1);


    }

    static ArrayList<Integer> allflineexp (int[]arr , int t , int i){
        ArrayList<Integer> ans = new ArrayList<>();
        if(i == arr.length){
            return ans ;
        }

        if(arr[i] == t){
            ans.add(i);

        }

        ArrayList<Integer> asnfrombelowcalls = allflineexp(arr, t, i + 1);

        ans.addAll(asnfrombelowcalls);
        return ans;
    }
}
