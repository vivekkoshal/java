package OopsPrinciple;

public class Main {
    public static void main(String[] args) {
        box duba = new box(3,4,5);
        box duba1 = new box(duba);
        child can = new child(32);

        System.out.println(duba1.l+" "+ duba.b+" "+ duba.h);
        System.out.println(can.l+" "+ can.h+" "+ can.b+" "+ can.weight);


        //it is the type of refernce that determines what members can be accessed not object;
        box boxx = new child(2,3,4,5);
        System.out.println(boxx.b+" "+ boxx.h+" "+ boxx.l+" ");//here boxx.weight cannot be accessed

        can cock = new can(1,3,4,5,6);
        can pepsi = new can(2);

        System.out.println(cock.weight+" "+cock.l+ " "+ cock.pprice);
        System.out.println(pepsi.weight+" "+ pepsi.l+ " " + pepsi.pprice);


    }
}

