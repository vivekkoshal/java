package ProRecursion;

import java.util.Arrays;

public class reversearray {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4};
        revarr(arr , 0);
        System.out.println(Arrays.toString(arr));
    }


    static void revarr(int[] arrr , int n ){
        int temp = 0;
        if(n > (arrr.length -1)/2){
            return;
        }

        temp = arrr[n];
        arrr[n] = arrr[arrr.length-1-n];
        arrr[arrr.length-1-n] = temp;

        revarr(arrr, n+1);

    }


}