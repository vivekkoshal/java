public class tab {
    static class intr extends Thread{



        int n ;
        intr(int n){
            this.n = n;
        }


        public synchronized void run(){

            for (int i = 1; i <= 10; i++) {
                System.out.println(n*i);

            }

        }

    }


    public static void main(String[] args) {
        intr ob1 = new intr(5);
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob1);


        try {
            //ob1.start();

           // ob1.join();

            t1.start();
            t2.start();
        }
        catch (Exception i){

        }
    }








}
