import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        System.out.print("enter the array here->");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0 ; i<10 ; i++){
            arr[i]= in.nextInt();

        }
        System.out.println("enter the no. to search->");
        int n = in.nextInt();
        int ans = linear(arr , n);

        System.out.println(ans);


    }

    static int linear(int[] arey , int num){
         int re= -1;
        for (int j = 0 ; j<arey.length;j++){
            if(num == arey[j]){
                re = j;
            }
        }
        return re;
    }







}
