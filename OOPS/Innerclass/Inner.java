package OOPS.Innerclass;

public class Inner{
//class Test{
//        String name ;
//
//        Test(String name){
//            this.name = name ;
//        }
//
//    }

    public static void main(String[] args) {
        Test a = new Test("vivek");
        Test b = new Test("rao");
        System.out.println(a.name);
        System.out.println(b.name);

    }


}


class Test{
    static String name ;

    Test(String name){
        Test.name = name ;
    }

}




