package OopsPrinciple;

public class child extends box{
    double weight;

    child(){
        super();   //box();
        this.weight=-1;
    }


    public child(double l, double h, double b, double weight) {
        super(l, h, b);  //calling parent class constructor
        this.weight = weight;
    }

    public child(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public child(double weight) {
        super();
        this.weight = weight;
    }

    public child(box obj, double weight) {
        super(obj);
        this.weight = weight;
    }

    child(child other){
        super(other);
        this.weight = other.weight;
    }
}
