import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
//    int[] arr = new int[5];
//    //or
//    int[] arr1 ={1 ,2 ,3, 4,5 }  ;
//
//        System.out.println(arr[3]);
//
//    String[] arey = new String[5];
//        System.out.println(arey[2] + arey[4]);
//
//        //input and output arrary
//        Scanner in = new Scanner(System.in);
//        int[] ar = new int[5];
//
//        for(int i = 0 ; i<ar.length ; i++){
//            ar[i]= in.nextInt();
//        }
//
//        for(int j=0 ; j<ar.length ; j++){          //way 1 to print
//            System.out.print(ar[j] + " ");
//        }
//
//        for (int i : ar) {
//            System.out.print(i + " ");             //way 2 to print
//        }
//
//        System.out.println(Arrays.toString(ar));    //way 3 to print


        //array of objects
        String[] arr = new String[5];
        Scanner in = new Scanner(System.in);

        for(int i = 0 ; i<arr.length ;i++){
          arr[i] = in.next();
        }
        System.out.println(Arrays.toString(arr));












    }



}
