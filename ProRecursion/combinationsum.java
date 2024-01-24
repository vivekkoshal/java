package ProRecursion;

import java.util.ArrayList;

public class combinationsum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6,7 };
        int n = arr.length;
        ArrayList<Integer> lis = new ArrayList<>();
        int ind = 0 ;
        int tg = 7;

        subsum(ind , arr , n , lis ,tg) ;
    }

    static void subsum(int ind , int[] arr , int n , ArrayList<Integer> lis  , int tg){

        if(ind>=n || tg<=0){
            if(tg==0){
                System.out.println(lis);
                return;
            }
            return;
        }
        //to pick a index
        lis.add(arr[ind]);
        tg = tg-arr[ind];

        subsum(ind , arr , n , lis  ,tg);

        lis.removeLast();
        tg = tg+arr[ind];

        //to not pic index
        subsum(ind+1 , arr, n ,lis , tg);


    }
}
