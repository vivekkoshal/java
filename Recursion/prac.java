package Recursion;

import java.util.ArrayList;

public class prac {
        public static void main(String[] args) {
            int[] arr = {1, 2, 1};
            int n = arr.length;
           int count = 0;
            int ind = 0;
            int sum = 2;
            int isum = 0;

            subsum(ind, arr, n, count, sum, isum);
        }

        static void subsum(int ind, int[] arr, int n,  int count, int sum, int isum) {

            if (ind >= n) {
                if (isum == sum) {
                   count++;
                }
                System.out.println(count);
                return;
            }
            //to pick a index
            isum = isum + arr[ind];
            subsum(ind + 1, arr, n, count, sum, isum);;
            isum = isum - arr[ind];
            //to not pic index
            subsum(ind + 1, arr, n, count, sum, isum);
        }
}
