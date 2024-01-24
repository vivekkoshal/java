import java.util.Scanner;

public class ceillinginchar {    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the array->");
    String arr = in.next();
    System.out.println("enter the target charachter ->");
    String t = in.next();

    int ans = ceiling(arr , t);
    System.out.println(arr.charAt(ans));
}

    static int ceiling(String arr , String t){
        int s = 0 ;
        int e = arr.length() -1;
        int mid = 0;
        while(s <= e){
            mid = s-(s-e)/2;

            if(arr.charAt(mid) <= t.charAt(0)){
                s = mid+1;
            }

            else if(arr.charAt(mid) > t.charAt(0)){
                e = mid-1;
            }

        }

        if(s== arr.length()){
            return 0;
        }
        else {
            return s;
        }



    }
}