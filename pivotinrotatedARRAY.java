import java.util.Scanner;

public class pivotinrotatedARRAY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array>");
        int siz = in.nextInt();
        System.out.print("enter the array here->");

        int[] arr = new int[siz];
        for (int i = 0; i < siz; i++) {
            arr[i] = in.nextInt();
        }

        int pv = pivot(arr);
        System.out.println(pv);

    }

    static int pivot(int[] arr){
        int s= 0;
        int e = arr.length -1;
        int mid ;
        while(s<=e){
            mid = s + (e- s) / 2;
            if( mid<e && arr[mid] > arr[mid+1]){
               return mid ;

            } else if (arr[mid-1] > arr[mid] ) {
                return mid;

            } else if (arr[mid] >= arr[0]){
                s= mid+1;

            }

            else {

                e = mid -1;
            }
        }

        return -1;

    }






}
