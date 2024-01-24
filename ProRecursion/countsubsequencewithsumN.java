package ProRecursion;

import java.util.ArrayList;

public class countsubsequencewithsumN {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1 };
        int n = arr.length;

        int ind = 0 ;
        int sum = 2 ;
        int isum = 0;


        System.out.println(counsubsum(ind , arr , n  , sum , isum )) ;
    }

    static int counsubsum(int ind , int[] arr , int n , int sum , int isum ){

        if(ind >= n){
            if(isum == sum) {
                return 1;
            }
            return 0;
        }
        //to pick a index
        isum = isum+arr[ind];
        int l =counsubsum(ind+1 , arr , n , sum , isum );
        isum = isum-arr[ind];
        //to not pic index
        int r = counsubsum(ind+1 , arr, n  , sum , isum );
        return l+r;

    }
}
