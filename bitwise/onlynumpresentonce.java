package bitwise;

import java.util.Scanner;

public class onlynumpresentonce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("size of array->");
        int s = in.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i]= in.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < s; i=i+1) {
            ans =ans ^arr[i];
        }
        System.out.println(ans);
    }
}
