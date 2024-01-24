import java.util.Scanner;

public class only {


        public static int ComputeFactorial(int n) {


            if (n == 1) {return 1;}
            else {return n*ComputeFactorial(n-1);}


        }
        public static void main(String[] args) {

            Scanner in =new Scanner(System.in);
            int a = in.nextInt();
            int b= ComputeFactorial(a);
            System.out.println(b);


        }

}
