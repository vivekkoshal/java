import java.util.Scanner;

public class elementswithevendigits {
    public static void main(String[] args) {
        System.out.print("enter the array here->");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();

        }

        int ans = numbers(arr);
        System.out.println(ans);

    }

    static int numbers(int[] arr){
        int sum = 0 ;

        for(int ele :arr){
            int i = 0;
            while(ele>0){
                i++;
                ele=ele/10;
            }

            if(i%2 == 0){
                sum = sum +1;
            }


        }

        return sum;
    }
}
