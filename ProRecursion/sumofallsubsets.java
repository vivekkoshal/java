package ProRecursion;

import java.util.ArrayList;

public class sumofallsubsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 };
        int n = arr.length;
        ArrayList<Integer> lis = new ArrayList<>();
        int ind = 0 ;
        int sum = 0;


        subsec(ind , arr , n , lis,sum);
    }

    static void subsec(int ind , int[] arr , int n , ArrayList<Integer> lis , int sum){

        if(ind >= n){
   //         System.out.println(lis);
            System.out.println(sum);
            return;
        }
//        //to pick a index
//        lis.add(arr[ind]);
//        sum = sum + arr[ind];

        subsec(ind+1 , arr , n , lis , sum+arr[ind]);
//        lis.removeLast();
//        sum = sum - arr[ind];

        //to not pic index
        subsec(ind+1 , arr, n ,lis,sum);


    }

}
