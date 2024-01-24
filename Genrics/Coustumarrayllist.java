package Genrics;

import java.util.ArrayList;
import java.util.Arrays;

public class Coustumarrayllist {

    private int[] data;
    private static int DefaultSize = 10 ;
    private int size =0;

    public Coustumarrayllist(){
        this.data = new int[DefaultSize];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }

        data[size] = num;
        size++;
    }


    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length*2];

        //copy in new array
        for(int i = 0 ; i< data.length ; i++){
            temp[i] = data[i];
        }

        data = temp ;

    }

    public int remove(){
        int removed = data[size];
        size--;
        return removed;

    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size+1;
    }

    public void set(int index , int value){
        data[index] =  value;
    }

    @Override
    public String toString() {
        return "Coustumarrayllist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       // ArrayList list  = new ArrayList();

        Coustumarrayllist liss = new Coustumarrayllist();
        for(int i = 0 ; i<15 ; i++){
            liss.add(i);
        }
        System.out.println(liss);

    }
}
