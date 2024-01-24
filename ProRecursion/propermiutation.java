package ProRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class propermiutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ind = 0;
        propermu(ind ,arr);

    }

    static void propermu(int ind , int[] arr){
        if(ind == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i = ind ; i< arr.length ; i++){
            int temp1 = arr[i];
            arr[i] = arr[ind];
            arr[ind] = temp1;

            propermu(ind+1 , arr);

            int temp2 = arr[i];
            arr[i] = arr[ind];
            arr[ind] = temp1;
        }


    }


}
