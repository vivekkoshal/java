
import java.util.Scanner;
import java.util.Arrays;

public class cp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {

            int n = in.nextInt();
            int m = in.nextInt();

            int[] arr1 = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = in.nextInt();

            }
            int[] arr2 = new  int[m];
            for (int j = 0; j < m; j++) {
                arr2[j] = in.nextInt();

            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int D = 0 ;
            for (int j = 0; j < arr1.length /2 ; j++) {
                D = D + Math.abs((arr1[j] - arr2[m-j-1]));
            }
            int x = 0;
            for (int j = arr1.length / 2; j < n ; j++) {

                D = D + Math.abs((arr1[j] - arr2[x]));
                        x++;
            }

            System.out.println(D);

        }
    }
}
