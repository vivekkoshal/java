package StacksandQuee;

public class CoustemStack {
    protected int[] data;
    private static final int defatul_size = 10 ;

    int ptr = -1;



    public CoustemStack(){
        this(defatul_size) ; // this will call the constructor below it
    }
    public CoustemStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false ;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop from empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot peek from empty stack");
        }
        return data[ptr];
    }









    private boolean isFull(){
        return ptr == data.length-1; //if pointer is at last index it will retuen true
    }
    private boolean isEmpty(){
        return ptr == -1; //ptr is at first index
    }










}
