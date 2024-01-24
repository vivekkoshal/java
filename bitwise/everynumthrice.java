package bitwise;

import java.util.Scanner;

public class everynumthrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("size of arr->");
        int s = in.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = in.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < s; i++) {
            sum = arr[i];
        }

        int ans = 3 % sum;
        System.out.println(ans);






    }
}
