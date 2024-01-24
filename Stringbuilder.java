import java.util.Arrays;

public class Stringbuilder {
    public static void main(String[] args) {
        String name = "Vivek Rao";
        System.out.println(name);
        String a = "vivek" ; String b = "vivek";
        //String pool is separate memory allocated in the heap
        // both a and b point to same object
        // String is immutable - the object cannot be modified

        //== checks weather pointing to same object or not
        System.out.println(a == b);

        //how to create diff objects of same value
        String p = new String("Rao");
        String q = new String("Rao");
        //these  are created outside the pool in the heap memory
        // prefered one is using string pool
        System.out.println(p == q);

        //whn only need to check value use .equals method
        System.out.println(p.equals(q));
        System.out.println(p.equals(a));
        //.equals only check the value spacing should be also equal

        //string is array of char
        System.out.println(a.charAt(0));

        //ouputs

        String nw = "my";
        System.out.println(nw);

        //PrettyPrinting
         float n = 123.8989f;
         //also rounds off the number
        System.out.printf("Formatted number is %.2f" , n);
        System.out.println();
        System.out.printf("pie  -> %.3f " ,Math.PI);
        System.out.println();
        System.out.printf("hello i am %s and i am %s","vivek" , "cool");
        System.out.println();
        //operaters

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        //integer will be converted to Integer that will call toString and it will be equal to "1" after few steps

        //performance

        //this is not a good method
        //this is makinging to much object every time as string is imutable
        String series = "";
        for (int i = 0; i <26; i++) {
            char ch = (char)('a'+i);
            System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);

        //Stringbuilder is used for this
        //this data type is just like string but multable
        StringBuilder build = new StringBuilder();
        for (int i = 0; i <26; i++) {
            char ch = (char) ('a' + i);
            build.append(ch);
        }
        System.out.println(build.toString());

        //Methods on string

        String sam = "vivek rao";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('v'));
        System.out.println("   vivek  yadav".strip());
        System.out.println(Arrays.toString(name.split(" ")));











    }





}
