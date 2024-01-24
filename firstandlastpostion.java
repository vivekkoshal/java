import java.util.Scanner;

public class firstandlastpostion { public static void main(String[] args) {
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

    int last = andl(arr, n);
    int first = andf(arr ,n);

    System.out.println(first);
    System.out.println( last);
}

static int andl(int[] arr , int n){
    int s = 0 ;
    int e = arr.length -1 ;
    int mid ;

    while(s<=e){
        mid = s+e/2-s/2;
        if(arr[mid] == n){
           s = mid+1;
        }

        else if(arr[mid] < n){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
    }

    return s-1;

}


    static int andf(int[] arr , int n){
        int s = 0 ;
        int e = arr.length -1 ;
        int mid ;

        while(s<=e){
            mid = s+e/2-s/2;
            if(arr[mid] == n){
                e = mid-1;
            }

            else if(arr[mid] < n){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }

        return e+1;

    }







}
