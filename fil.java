import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class fil {
    public static Vector<String> test(String[] fileNames)
    {
        Vector<String> javaFles= new Vector<>();
        for (int i = 0 ; i<fileNames.length ; i++){
            String temp = fileNames[i];
            String ans = ".java";
            if(temp.length()<5){

            }
            else{
                if((ans.equals(temp.substring(temp.length()-5 , temp.length())))) {
                    javaFles.add(temp);
                }
            }
        }
        return javaFles;
    }

    public static void main(String[] args) {
        String inputs[] = {"a.java","a.pdf", "a.java","a.java.pdf","b.java"};
        System.out.println(test(inputs));
    }
}
