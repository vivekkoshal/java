package OOPsfun;

public class cls {
    final int age = 19 ;
    String name ;

    int rank;

    cls(){
    }
    cls(int ag , int rnk , String nam){
       // this.age = ag;
        this.rank=rnk;
        this.name = nam;

    }

    static void  nil(){
        int ru = 22 ;
        int tt = 12 ;
        System.out.println("i am in static block");
    }


    void greet(){
        System.out.println("hi lord "+ name);
    }

    void rank(){
        System.out.println("your rank is "+ rank);

    }

    void future(String cree){
        System.out.println("I want to become "+ cree);
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println(" object is distroyed");
    }


     static class patu{
        int pu = 88;
        int st = 99;

        void gret(){
            System.out.println("i am in inner static class");
        }

         @Override
         protected void finalize() throws Throwable {
             super.finalize();
             System.out.println("gb road thrown");
         }
     }

}


