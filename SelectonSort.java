import java.util.Arrays;
import java.util.Scanner;

public class SelectonSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array>");
        int siz = in.nextInt();
        System.out.print("enter the array here->");

        int[] arr = new int[siz];
        for (int i = 0; i < siz; i++) {
            arr[i] = in.nextInt();
        }

        int[] ans = selectsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] selectsort(int[] arr){
    int lg = 0 ;
    int temp = 0 ;
    int sz = arr.length -1;
    int x = 0;

    for(int i = 0 ; i<arr.length ; i++){
        temp = 0 ;
        lg = arr[0];
        x= 0;

        for(int j = 0 ; j < arr.length -i ; j++){
            if(lg < arr[j]){
                lg = arr[j];
                x= j;
            }
        }
        temp = arr[sz-i] ;
        arr[sz-i] = arr[x];
        arr[x] =  temp;


    }
        return arr;


    }






















}
