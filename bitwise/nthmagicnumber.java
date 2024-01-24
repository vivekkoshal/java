package bitwise;

import java.util.Scanner;

public class nthmagicnumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("value o f n->");
        int n = in.nextInt();

        int sum = 0  ;
        int mult = 5 ;
        int dig = 0;
        for (int i = 0; n>0 ; i++) {
            dig = n&1;

        sum = sum+dig*mult;
        mult= mult*5;
        n = n>>1;
        }
        System.out.println(sum);

    }
}
