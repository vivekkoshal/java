package Genrics;

import java.util.Arrays;

public class CostumGenricArrayList<T> {

    private Object[] data;
    private static int DefaultSize = 10 ;
    private int size =0;

    public CostumGenricArrayList(){
        data = new Object[DefaultSize];
    }

    public void add(T num){
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
        Object[] temp = new Object[data.length*2];

        //copy in new array
        for(int i = 0 ; i< data.length ; i++){
            temp[i] = data[i];
        }

        data = temp ;

    }

    public T remove(){
        T removed = (T)(data[size]);
        size--;
        return removed;

    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index , T value){
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

        CostumGenricArrayList<String> list = new CostumGenricArrayList<String>();
        for (int i = 0; i < 15; i++) {
            list.add("vivek");
        }

        System.out.println(list);

    }
}
