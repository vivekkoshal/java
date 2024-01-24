import java.util.Scanner;

public class amstrongnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("provide a 3 digit no.->");
        int n = in.nextInt();
        int ans = astg(n);
        System.out.println(ans);
    }

    static int astg(int a){
        int sum = 0;
        int x=0;
        for(int i = 1 ; i<4  ;i++){
            x=a%10;
            sum= sum+x*x*x;
            a=a/10;
        }
        return sum;
    }





}

