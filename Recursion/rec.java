package Recursion;

public class rec {
//    public static void intro(String[] args) {
//        message();
//    }
//
//     static void message(){
//         System.out.println("Hello World");
//         message1();
//     }
//    static void message1(){
//        System.out.println("Hello World");
//    }


//    public static void intro(String[] args) {
//        //print a number from 1 to 5 ;
//        prinum1(1);
//    }
//
//    static void prinum1(int n ){
//        System.out.println(n);
//        prinum2(2);
//    }
//
//    static void prinum2(int n ){
//        System.out.println(n);
//        prinum3(3);
//    }
//
//    static void prinum3(int n ){
//        System.out.println(n);
//        prinum4(4);
//    }
//    static void prinum4(int n ){
//        System.out.println(n);
//        prinum5(5);
//    }
//    static void prinum5(int n ){
//        System.out.println(n);
//
//    }


//    public static void intro(String[] args) {
//        // print n number using recursiion
//
//        pritnum(1);
//    }
//
//    static void pritnum(int n){
//
//
//        System.out.println(n);
//        if(n == 5){
//            return;
//        }
//        pritnum(n+1);
//    }

//nth fibonarchi number
//public static void intro(String[] args) {
//
//   int ans = fibo(4);
//    System.out.println(ans);
//}
//
//    static int fibo(int n ){
//
//    if(n<2){
//        return n;
//    }
//    return fibo(n-1)+fibo(n-2);
//
//    }


//Binary Search

    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7,8,9};
    int n = 7;
        System.out.println(serch(arr, n, 0 ,8));
    }

    static int serch(int[] arr , int n , int s , int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;

        if(arr[m] == n){
            return m;
        }

        if(arr[m]  > n){
            return serch(arr, n, s, m-1);

        }


            return serch(arr, n, m+1, e);





    }














}
