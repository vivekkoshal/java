import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class binaryin2darray {
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
        int[] ans = search(arr , n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix , int tg){
        int r = 0 ;
        int c = matrix.length -1 ;
        while(r < matrix.length && c >=0){
            if(matrix[r][c] == tg){
                return new int[]{r , c};
            }
            else if (matrix[r][c] < tg)  {
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{ -1 , -1 };
    }














}
