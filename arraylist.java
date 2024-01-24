import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(67);
        list.add(67);list.add(67);list.add(67);list.add(67);list.add(67);list.add(67);

        list.set(0 ,99);
        list.remove(2);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        //input
        for(int i = 0 ; i< 10 ; i++){
            list1.add(i , in.nextInt());
        }

        //output
        System.out.println(list1);
        for(int i = 0 ; i< 10 ; i++){
            System.out.print(list1.get(i) + " ");
        }



    }















}
