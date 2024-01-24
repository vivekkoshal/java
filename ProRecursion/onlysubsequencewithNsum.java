package ProRecursion;

import java.util.ArrayList;

public class onlysubsequencewithNsum {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for(int i = 0; i < 1000;i++)
        {
            arr[i] = i*i-1;
        }
//        int[] arr = {1, 2, 1 };
        int n = arr.length;
        ArrayList<Integer> lis = new ArrayList<>();
        int ind = 0 ;
        int sum = 100000 ;
        int isum = 0;

        subsum(ind , arr , n , lis , sum , isum) ;
    }

    static boolean subsum(int ind , int[] arr , int n , ArrayList<Integer> lis , int sum , int isum){
        if(ind >= n){
            if(isum == sum) {
                System.out.println(lis);
                return true;
            }
            return false;
        }
        //to pick a index
            lis.add(arr[ind]);
            isum = isum + arr[ind];
          if(  subsum(ind + 1, arr, n, lis, sum, isum) == true){
              return true;
          }
            lis.removeLast();
            isum = isum - arr[ind];
            //to not pic index
        if(  subsum(ind + 1, arr, n, lis, sum, isum) == true){
            return true;
        }
        return false;
    }
}
