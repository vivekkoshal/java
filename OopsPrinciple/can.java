package OopsPrinciple;

public class can extends child {
    double pprice;
    can(int pp){
        super();
        this.pprice = pp;
    }

    can(can old){
        super(old);
        this.pprice = old.pprice;
    }

    public can(double l, double h, double b, double weight, double cost) {
        super(l, h, b, weight);
        this.pprice = cost;

    }
}
