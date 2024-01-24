package ProRecursion;

import java.util.ArrayList;

public class subsequencewithNsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1 };
        int n = arr.length;
        ArrayList<Integer> lis = new ArrayList<>();
        int ind = 0 ;
        int sum = 2 ;
        int isum = 0;

        subsum(ind , arr , n , lis , sum , isum) ;
    }

    static void subsum(int ind , int[] arr , int n , ArrayList<Integer> lis , int sum , int isum){

        if(ind >= n){
            if(isum == sum) {
                System.out.println(lis);
            }
            return;
        }
        //to pick a index
        lis.add(arr[ind]);
        isum = isum+arr[ind];
        subsum(ind+1 , arr , n , lis , sum , isum);
        lis.removeLast();
        isum = isum-arr[ind];
        //to not pic index
        subsum(ind+1 , arr, n ,lis , sum , isum);
    }
}
