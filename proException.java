public class proException {
    public static void main(String[] args) {

        //object class is inhertited by throwable class(it has two subclass exception and error);
        //Exceptions are of two types Checked and Unchecked;
        //checked exception checked during the complie time{eg given  a file location and file does not exist}
        //unchecked exception checked during the run time(compiler will not detect it){eg divide by zer0};
        int a = 12 ;
        int b = 0 ;
        try{
//        int c =a/b;
//           divide(a,b);
//            prodivide(a,b);
//
//            mimicing an exception
//            throw new Exception("just for fun");
//
//            mimicing throwing my built exception
            String name = "vivek";
            if(name.equals("vivek")) {
                throw new promyExceptions("cool vivek is now exception");
            }
        }
        catch (promyExceptions y){
            System.out.println(y.getMessage());
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());

        }

        //this will only exicute if it doesnot finds an arthematic exceptionn and if we fut it above arthmetic excption then arthmeticexception will never exicute as it covers all exceptions
        catch (Exception e){
            System.out.println("normarl exception");

        }



        finally {
            System.out.println("this will always exicute");
        }
    }

    static int divide(int a , int b){
        return a/b;
    }
    static int prodivide(int a , int b) throws ArithmeticException{
        if(b == 0 ){
            throw new ArithmeticException("please donot divide by zero"); //inside () we can pass message
        }
        return a/b;
    }





}
