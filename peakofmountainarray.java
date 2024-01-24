import java.util.Arrays;
import java.util.Scanner;

public class peakofmountainarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array>");
        int siz = in.nextInt();
        System.out.print("enter the array here->");

        int[] arr = new int[siz];
        for (int i = 0; i < siz; i++) {
            arr[i] = in.nextInt();
        }
        int ans = mount(arr);
        System.out.println(ans);
    }


    static int mount(int[] arr){
        int s = 0 ;
        int e = arr.length -1 ;
        int mid = 0;
        int peak = 0;


        while (s<e){
            mid = s + (e-s)/2;

            if(arr[mid] > arr[mid+1]){
                e=mid;
            }
            else  {
                s = mid+1;
            }


        }

        return e ;


    }















}
