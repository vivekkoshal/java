import java.util.Scanner;

public class Lsearchintwodarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the array here->");
                int[][] arr = new int[3][3];
        for(int row = 0 ; row<arr.length ; row++){
            //for loop for the coloumn
            for(int col = 0 ; col<arr[row].length  ; col++){
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println("enter the no. to search->");
        int n = in.nextInt();
        boolean ans = lintwod(arr , n);
        System.out.println(ans);
    }


    static boolean lintwod(int[][] arr , int n) {

        boolean bool = false;
        for (int row = 0; row < arr.length; row++) {
            //for loop for the coloumn
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == n) {
                    bool = true;
                }
            }
        }
        return bool;

    }

























}
