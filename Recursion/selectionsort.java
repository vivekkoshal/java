package Recursion;

import java.util.Arrays;

public class selectionsort {


    public static void main(String[] args) {
        int[] arr = {2 ,1 ,4 ,5 };
        selec(arr ,arr.length,0 , 0);
        System.out.println(Arrays.toString(arr));
    }







    static void selec(int[] arr , int r , int c ,int max){
        if (r==0){
            return;
        }
        if(c<r) {
            if (arr[c] > arr[max]) {
                selec(arr, r, c + 1, c);
            }
            else {
                selec(arr, r , c+1, max);
            }
        }
        else {
            int temp = arr[r-1];
            arr[r-1] = arr[max];
            arr[max] = temp;

        selec(arr , r-1 , 0 ,0);
        }
    }



}


