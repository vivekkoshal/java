package ProRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class mergsort {
    public static void main(String[] args) {
        int[] arr = {2  , 4, 2, 1 ,1,3,5};
        Mergsort(arr , 0 , 6);
        System.out.println(Arrays.toString(arr));
    }

    static void Mergsort(int[] arr , int low , int high){
        if(low==high){
            return;
        }
        int mid = (low+high)/2;
        Mergsort(arr, low , mid );
        Mergsort(arr , mid+1 , high);
        Merg(arr , low , mid , high);

    }

    static void Merg(int[] arr , int low , int mid , int high){
        int left = low ;
        int right = mid+1;
        ArrayList<Integer> lis = new ArrayList<>();
        while(left<= mid && right<=high){
            if(arr[left]<=arr[right]){
                lis.add(arr[left]);
                left++;
            }
            else{
                lis.add(arr[right]);
                right++;
            }
        }

        while(left<= mid){
            lis.add(arr[left]);
            left++;
        }

        while(right<=high){
            lis.add(arr[right]);
            right++;
        }

        for (int i = low ; i<=high ; i++){
            arr[i] = lis.get(i-low);
        }


    }

}
