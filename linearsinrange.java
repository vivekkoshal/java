import java.util.Scanner;

public class linearsinrange {

        public static void main(String[] args) {
            System.out.print("enter the array here->");
            Scanner in = new Scanner(System.in);
            int[] arr = new int[10];
            for (int i = 0 ; i<10 ; i++){
                arr[i]= in.nextInt();

            }
            System.out.println("enter the no. to search->");
            int n = in.nextInt();
            System.out.println("enter the ranges ->");
            int r1  = in.nextInt();
            int r2 = in.nextInt();
            int ans = linear(arr , n , r1 , r2);

            System.out.println(ans);


        }

        static int linear(int[] arey , int num , int r1 , int r2){
            int re= -1;
            for (int j = r1 ; j<= r2 ; j++){
                if(num == arey[j]){
                    re = j;
                }
            }
            return re;
        }







    }

