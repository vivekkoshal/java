package ProRecursion;

import java.util.ArrayList;

public class allpermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> lis = new ArrayList<>();
        boolean freq[] =new boolean[arr.length];
        permu(arr , lis , freq);

    }

    static void permu(int[] arr , ArrayList<Integer> lis ,boolean[] freq){

        if(lis.size() == arr.length){
            System.out.println(lis);
            return;
        }

        for (int i = 0; i < arr.length ; i++) {
            if(true != freq[i]){
                freq[i] = true;
                lis.add(arr[i]);
                permu(arr ,lis , freq);
                freq[i] =false ;
                lis.removeLast();
            }

        }



    }




}
