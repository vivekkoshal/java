package Acess;

public class Main{

    public static void main(String[] args) {
        lock obj = new lock( "vivek");

        //access and modify data members using getter and setter


        System.out.println(obj.getNum()) ;
        System.out.println(obj.name);



    }
}
