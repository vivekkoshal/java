package CompareCLasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Vivek = new Student(12 , 89.77f);
        Student Rahul = new Student(24 , 22.33f);
        Student baala = new Student(21 , 42.13f);
        Student tari = new Student(22 , 29.35f);
        Student ranjan = new Student(234 , 43.53f);
        Student sikh = new Student(23 , 23.43f);

        Student[] list = {Vivek ,Rahul , baala , tari , ranjan , sikh};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));




        if(Vivek.compareTo(Rahul) > 0){
            System.out.println("Vivek has more marks");
        }



    }







}
