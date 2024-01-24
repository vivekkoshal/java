package ProRecursion;

public class firstnsum {
    public static void main(String[] args) {
        System.out.println(sumi(5));
        parametersum(5 ,0);
    }

    static int sumi(int n ) {

        if (n == 1) {
            return 1;
        }

       return n + sumi(n - 1);


    }

    static void parametersum(int i , int sum){
        if(i== 0){
            System.out.println(sum);
            return ;
        }

        parametersum(i-1 , sum+i);

    }


}
