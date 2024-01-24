package Exceptionhandling;

import CompareCLasses.Student;

public class Main {
    public static void main(String[] args) {
        int a = 5 ;
        int b = 0 ;
        try {
            int c = a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will always exicute");
        }

        int c = divide(4,0);


    }

    static int divide(int c , int d)  throws ArithmeticException {
        if(d == 0){
            throw new ArithmeticException("galtii");
        }

        return c/d;

    }


}
