package dsamath;

public class lcm {
    public static void main(String[] args) {
        System.out.println(lc(2,7));
    }

    static int lc(int a, int b){
return a*b/gcd(a,b);
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }


        return gcd(b%a ,a );
    }




}
