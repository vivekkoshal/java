import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array>");
        int siz = in.nextInt();
        System.out.print("enter the array here->");

        int[] arr = new int[siz];
        for (int i = 0; i < siz; i++) {
            arr[i] = in.nextInt();
        }

        int[] ans = bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] bubble(int[] arr){
        int temp = 0;
        int best = 0 ;
        for(int i = 0 ; i < arr.length; i++){

            for(int j = 1 ; j < arr.length-i ; j++ ){
                best= 0;

                if(arr[j] < arr[j-1]){
                     temp = arr[j-1];
                    arr[j-1] =  arr[j] ;
                    arr[j] = temp ;
                    best++;
                }

            }
            if(best == 0){
                return arr;
            }
        }

        return arr;







    }















}
