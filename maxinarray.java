import java.util.Scanner;

public class maxinarray {
    public static void main(String[] args) {
        System.out.print("enter the array here->");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();

        }

        int ans = maxin(arr);
        System.out.println(ans);

    }


    static int maxin(int[] arr){
        int max = Integer.MIN_VALUE;
              for(int elem : arr) {
                  if(max<elem){
                     max = elem ;
                  }
              }

               return max;



    }











}
