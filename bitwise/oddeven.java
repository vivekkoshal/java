package bitwise;

import java.io.InputStream;
import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();


        if((n&1) ==1){
            System.out.println("odd");
        }

        else{
            System.out.println("even");
        }








    }



}
