package ProRecursion;

import java.util.ArrayList;

public class uniquesumcombinationsinsortedorder {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2 ,2 };
        int n = arr.length;
        ArrayList<Integer> lis = new ArrayList<>();
        int ind = 0 ;
        int tg = 4 ;

        subsum(ind , arr , n , lis ,tg) ;
    }

        static void subsum(int ind , int[] arr , int n , ArrayList<Integer> lis  , int tg){

            if(tg==0){

                    System.out.println(lis);
                    return;
            }

            for(int i =ind ; i< arr.length ; i++) {


                if(i> ind && arr[i] == arr[i-1]){
                    continue;
                }
                if(arr[i] > tg){
                    break;
                }

                //to pick a index
                lis.add(arr[i]);

                subsum(i+1, arr, n, lis, tg -arr[i]);

                lis.remove(lis.size()-1);
            }

        }


}
