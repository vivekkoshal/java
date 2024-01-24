package com.rj.staticex;

public class human  {
    int age;
    String name;
    int salary ;
    boolean married;

    static long popu;

    public human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        human.popu = popu+1;
    }
}
