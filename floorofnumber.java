import java.util.Scanner;

public class floorofnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array->");
        int sz = in.nextInt();
        System.out.println("enter the array->");
        int[] arr = new int[sz];
        for (int i = 0 ; i<sz ; i++){
            arr[i]= in.nextInt();
        }

        System.out.println("enter the target value ->");
        int t = in.nextInt();

        int ans = ceiling(arr , t);
        System.out.println(ans);
    }

    static int ceiling(int[] arr , int t){
        int s = 0 ;
        int e = arr.length;
        int mid;
        int floor = 0;
        while(s <= e){
            mid = s-(s-e)/2;

            if(arr[mid] < t){
                s = mid+1;
                floor=arr[mid];
            }

            else if(arr[mid] >t){

                e = mid-1;
            }

            else{
                return arr[mid];
            }

        }
        return floor;


    }
}
