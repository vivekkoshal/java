package Recursion;

public class findsortedarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 12, 13};
        System.out.println(sorted(arr));
    }

    static boolean sorted(int[] arr) {

    return helper(arr ,0);
    }

    static boolean helper(int[] arr , int n){

        if(n == arr.length-1){
            return true;
        }
        return arr[n] < arr[n+1] && helper(arr , n+1) ;


    }





}
