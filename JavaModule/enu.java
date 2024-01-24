package JavaModule;
 import java . util .*;
 import java . io .*;

public class enu {

         public static void main ( String args [])
         {
             try {
                 FileInputStream fstream =
                 new FileInputStream (" file . txt ");
                 Scanner s = new Scanner ( fstream );
                while (s . hasNextLine ())
                     System . out . println (s. nextLine ());
                } catch ( FileNotFoundException e) {
                 System . out . println (" File not found ");
                 }
             }
         }

