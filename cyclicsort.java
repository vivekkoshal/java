import java.util.Arrays;
import java.util.Scanner;

public class cyclicsort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array>");
        int siz = in.nextInt();
        System.out.print("enter the array here->");

        int[] arr = new int[siz];
        for (int i = 0; i < siz; i++) {
            arr[i] = in.nextInt();
        }

        int[] ans = cycles(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] cycles(int[] arr){
        int i = 0 ;
        int temp = 0 ;
        while (i < arr.length){
            int indi = arr[i] -1 ;

            if(arr[i] != arr[indi]) {
                temp = arr[i];
                arr[i] = arr[indi];
                arr[indi] = temp; 
            }

           else {
                i++;
           }

        }

            return arr;




    }
}
