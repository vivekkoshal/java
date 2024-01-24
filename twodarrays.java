import java.util.Arrays;
import java.util.Scanner;

public class twodarrays {

    public static void main(String[] args) {

        int[][] arr = new int[3][3]; //adding rows is mandatory
        //or
        int[][]arr1 ={
                {1 ,2 ,3} ,
                {3, 4, 5},
                {6 , 7, 8}
        };


        System.out.println(Arrays.toString(arr1 ));
            //input and output
        Scanner in = new Scanner(System.in);

        for(int row = 0 ; row<arr.length ; row++){
            //for loop for the coloumn
            for(int col = 0 ; col<arr[row].length  ; col++){
                    arr[row][col] = in.nextInt();

            }
        }

        for(int row = 0 ; row<arr.length ; row++){
            //for loop for the coloumn
            for(int col = 0 ; col<arr[row].length  ; col++){
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }

        for(int row = 0 ; row<arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }

    }



















}








