package Acess;

    public class lock {
     private int num ;

      int getNum(){
        return num;
    }

    public void setNum( int x){
        this.num = x;
    }
     String name ;
    int[] arr;

    public lock( String name) {

        this.name = name;
        this.arr = new int[num];
    }
}
