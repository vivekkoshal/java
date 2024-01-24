import java.util.Scanner;

public class lsearchinstrings   {
    public static void main(String[] args) {
        System.out.print("enter the string here->");
        Scanner in = new Scanner(System.in);
        String arr = in.next();

        System.out.println("enter the word to search->");
        char n ='v';
        boolean ans = linearstrg(arr , n);

        System.out.println(ans);

    }


    static boolean linearstrg( String sent , char w){

        boolean bool = false;
        for(int i = 0 ; i< sent.length() ; i++){
            if(sent.charAt(i) == w){
                bool = true;
            }
        }

        return bool;

    }








}
