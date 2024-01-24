import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a  = in.nextInt();
            System.out.println(Isprim(a));
        }
    }

    public static boolean Isprim(int a){
        for(int i = 2 ; i<a ; i++ ){
            if(a%i == 0){
                return false;
            }
        }
        
        return true;


    }



}
