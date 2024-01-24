package LamdaFun;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.function.Consumer;

public class lama {
    public static void main(String[] args) {
        ArrayList<Integer>  lis = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lis.add(i);
        }

       // lis.forEach((item)-> System.out.println(item*2));
        Consumer<Integer> fun = (item)-> System.out.println(item*2);
                lis.forEach(fun);

    }

    int sum(int a , int b){
        return a+b;
    }
}
