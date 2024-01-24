import java.util.Arrays;
import java.util.Scanner;

public class missingnumberinarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array>");
        int siz = in.nextInt();
        System.out.print("enter the array here->");

        int[] arr = new int[siz];
        for (int i = 0; i < siz; i++) {
            arr[i] = in.nextInt();
        }

        int ans = miss(arr);
        System.out.println(ans);
    }

    static int miss(int[] arr){
        int i = 0 ;
        while(i < arr.length){
            int in = arr[i];
            int temp = 0 ;

            if( arr[i] >= arr.length){
                i++;
            }

            else if(arr[i] != arr[in]){
                temp = arr[i];
                arr[i] = arr[in] ;
                arr[in] = temp;
            }



            else{
                i++;
            }


        }

        for(int j =0 ; j< arr.length ; j++){
            if(arr[j] != j){
               return j;
            }

        }

       return arr.length;
    }





}
