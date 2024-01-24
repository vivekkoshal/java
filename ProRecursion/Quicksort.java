package ProRecursion;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {2  , 4, 2, 1 ,1,3,5};
        quick(arr , 0 , 6);
        System.out.println(Arrays.toString(arr));

    }
    static void quick(int[] arr , int low  , int high){
        if(low< high){
            int  p = partion(arr, low , high);
            quick(arr , low , p-1);
            quick(arr , p+1 , high);
        }
    }


    static int partion(int[] arr , int low , int high){
        int pivot  =arr[low] ;
        int i = low;
        int j = high;
        while (i<j){
            while(arr[i]<= pivot && i<=high-1){
            i++;
            }
            while(arr[j]> pivot && j>= low+1){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tp = arr[low];
        arr[low] = arr[j];
        arr[j]  = tp;
        return j;
    }



}
