package com.rj.staticex;
//how to initialisation of static variable
public class Stativin {
    static int a  = 4;
    static int b ;

    //only runs once when the first object is created
    static {
        System.out.println("inside static block");
        b = a*5;
    }

    public static void main(String[] args) {
        Stativin obj = new Stativin();
        System.out.println(Stativin.a + " " + Stativin.b);

        Stativin.b += 3;
        Stativin mon  = new Stativin();
        System.out.println(Stativin.a +" " + Stativin.b);


    }

}
