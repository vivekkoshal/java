import java.util.Scanner;

public class findinmountainarrray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array>");
        int siz = in.nextInt();
        System.out.print("enter the array here->");

        int[] arr = new int[siz];
        for (int i = 0; i < siz; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the num to search->");
        int n = in.nextInt();

        int ans = mount(arr);
        int s = 0 ;
        int e = arr.length -1;

        int mans= biin(arr , n , s , ans);
        int mans2 = biin(arr , n , ans , e);

        System.out.println(mans + " " +mans2);



    }

    static int mount(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int mid = 0;
        int peak = 0;


        while (s < e) {
            mid = s + (e - s) / 2;

            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }


        }

        return e;


    }

    static int biin(int[] arr, int n , int s , int e) {

        int mid;

        while (s <= e) {
            mid = s + e / 2 - s / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] < n) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;


    }


}