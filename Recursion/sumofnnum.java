package Recursion;

public class sumofnnum {

    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static int sum(int n){

        if(n == 1){
            return 1;
        }
        int ans = n+sum(n-1);

        return ans;


    }














}
