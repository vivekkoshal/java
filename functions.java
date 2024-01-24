import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        //sum();
//        int ans = sumval();
//        System.out.println(ans);

        String ans =greet("vivek");
        System.out.println(ans);
//
//        int ans = sum3(2 , 10);
//        System.out.println(ans);
    }

    //sum function
//    static void sum(){
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter first number->");
//        int a = in.nextInt();
//        System.out.print("enter second number->");
//        int b = in.nextInt();
//        int sum  = 0;
//        sum = a+b;
//        System.out.println("the sum is->"+ sum);
//
//    }


    //returning int instead of void
//static int sumval(){
//            Scanner in = new Scanner(System.in);
//        System.out.print("enter first number->");
//        int a = in.nextInt();
//        System.out.print("enter second number->");
//        int b = in.nextInt();
//        int sum  = 0;
//        sum = a+b;
//    return sum;
//}

    // returning string
//static String greet(){
//        String greeting = "Nameste";
//        return greeting;
//}

//    //passing value of function while calling the function
//    static int sum3(int a , int b){
//        int sum  =a+b;
//        return sum;
//    }


static String greet(String name){
        String g = "hello!"+ name + " how are you";
        return g;
}









}
