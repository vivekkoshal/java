package allmissingno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duplicateinarray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of array>");
        int siz = in.nextInt();
        System.out.print("enter the array here->");

        int[] arr = new int[siz];
        for (int i = 0; i < siz; i++) {
            arr[i] = in.nextInt();
        }

        List<Integer> ans = miss(arr);
        System.out.println(ans.toString());
    }

    static List<Integer> miss(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int in = arr[i] - 1;
            int temp = 0;

            if (arr[i] != arr[in]) {
                temp = arr[i];
                arr[i] = arr[in];
                arr[in] = temp;
            } else {
                i++;
            }

        }

        List<Integer> ret = new ArrayList<Integer>();

        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] != j+1){
                ret.add(arr[j]);
                ret.add(j+1);
            }


        }

        return ret;


    }
}
