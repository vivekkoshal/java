package Recursion;

public class sumofdigitis {
    public static void main(String[] args) {
        System.out.println(digsum(5555));
    }


    static int digsum(int n ){

    if(n == 0){
        return 0;
    }

    return n%10 + digsum(n/10);

    }





}
