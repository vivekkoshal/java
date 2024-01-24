package JavaModule;

class secondimpl implements myinterface {

         public void test (){
         System . out . println (" Function : test in second implemented class ");
         }
 }

         public class interfaces implements myinterface {

         public void test (){
         System . out . println (" Function : test in first implemented class ");
         }

         public static void main ( String args [])
 {
         myinterface fun = new interfaces ();
         myinterface fun2 = new secondimpl ();
         fun . test ();
         fun2 . test ();
         }
}

