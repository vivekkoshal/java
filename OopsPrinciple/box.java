package OopsPrinciple;

public class box {
    double l ;
    double h ;
    double b;
    box(double l , double h , double b){
        this.l = l ;
        this.b = b ;
        this.h = h;
    }

    box(double side) {
        this.b = side;
        this.h= side;
        this.l = side ;
    }


    box(){
        this.l = -1;
        this.h = -1 ;
        this.b = -1;
    }

    box(box obj){
        this.h = obj.h;
        this.l = obj.l;
        this.b = obj.b;
    }

    public void info(){
        System.out.println("box running");
    }

}
