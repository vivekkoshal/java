package ProRecursion;

import java.util.ArrayList;

public class nonduplicatesubsets {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 5};
        int n = arr.length;
        ArrayList<Integer> lis = new ArrayList<>();
        int ind = 0;


        subsum(ind, arr, n, lis);
    }


    static void subsum(int ind, int[] arr, int n, ArrayList<Integer> lis) {

        System.out.println(lis);
        for (int i = ind; i < arr.length; i++) {


            if (i != ind && arr[i] == arr[i - 1]) {
                continue;
            }
            //to pick a index
            lis.add(arr[i]);

            subsum(i + 1, arr, n, lis);

            lis.remove(lis.size() - 1);
        }

    }
}
