package garbeg;

public class ga {
   static class Gargi{
        int a;
        String name;

        public Gargi(int val) {
            this.a = val;
            this.name = null;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("garbage colletor came");
           super.finalize();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Gargi chutiya = new Gargi(3);
        }


    }
}
