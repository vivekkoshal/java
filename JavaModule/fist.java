package JavaModule;

public class fist {


        public static void main ( String args [])
         {
             int [] data = new int [20];

             try {
                 for ( int i =0 ; i < 21; i ++)
                     data [i] = 2* i;

                 }
            catch ( ArrayIndexOutOfBoundsException en )
             {
                 System.err.println (" error in accessing array index ");
                 }
         }
}
