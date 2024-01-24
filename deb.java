
import java.util.Scanner;

public class deb {


        public static int first = -1;
        public static int last = -1;
        public static void GiveFirstnLast(String str,char ch,int idx , int lass){

            if(idx == str.length()-1){
                System.out.println(first);
                System.out.println(last) ;
                return;
            }

            if(str.charAt(idx)==ch){
                if(first == -1){
                    first=idx;
                }
                else{
                    last=idx;
                }
                GiveFirstnLast(str, ch , idx++ , lass);

            }
        }
        public static void main(String[] args){
            System.out.println("Enter the String");
            Scanner sc = new Scanner(System.in);
            String x = sc.next();
            System.out.println("Give character you want to find indexes");
            char ch = sc.next().charAt(0);
            GiveFirstnLast(x,ch,0 ,x.length()-1);

        }

    }

