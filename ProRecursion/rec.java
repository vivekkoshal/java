package ProRecursion;

public class rec {
    public static void main(String[] args) {
        int n = 5;
//        fun(n);
//        ncount(n);
//        n1count(n);
        n2count(0,n);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println ("vivek");

        fun(n-1);
    }

    static void ncount(int n){
        if(n==0){
            return;
        }
        System.out.println(n);

        ncount(n-1);
    }

    //backtracing printing while returning
    static void n1count(int n){
        if(n==0){
            return;
        }
        n1count(n-1);
        System.out.println(n);
    }

    static void n2count(int i ,int n){
        if(i>n){
            return;
        }
        n2count(i+1 ,n);

        System.out.println(i);
    }

}
