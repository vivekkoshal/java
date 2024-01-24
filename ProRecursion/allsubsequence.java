package ProRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class allsubsequence {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3 };
        int n = arr.length;
        ArrayList<Integer> lis = new ArrayList<>();
        int ind = 0 ;


        subsec(ind , arr , n , lis);
    }

    static void subsec(int ind , int[] arr , int n , ArrayList<Integer> lis){

        if(ind >= n){
            System.out.println(lis);
            return;
        }
        //to pick a index
        lis.add(arr[ind]);

        subsec(ind+1 , arr , n , lis);
        lis.removeLast();

        //to not pic index
        subsec(ind+1 , arr, n ,lis);


    }







}
