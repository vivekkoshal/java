import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array>");
        int siz = in.nextInt();
        System.out.print("enter the array here->");

        int[] arr = new int[siz];
        for (int i = 0; i < siz; i++) {
            arr[i] = in.nextInt();
        }

        int[] ans = insers(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] insers(int[] arr){
        int temp = 0 ;
        for (int i = 0; i < arr.length -1; i++) {
            temp = 0;
            for (int j = i+1 ; j >0 ; j--) {

                if(arr[j]< arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

                else{
                    break;
                }
            }

        }
        return arr ;

    }





}
