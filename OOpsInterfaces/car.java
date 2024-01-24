package OOpsInterfaces;

public  class car implements englin , Break , Media{

    @Override
    public void brk() {
        System.out.println("I break like normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");

}

//    @Override
//    public void acc() {
//        System.out.println("I acc like a normal car");
//
//    }

    public static void main(String[] args) {
        car audi = new car();
        englin.acc();
        audi.start();
        audi.brk();
        audi.stop();
    }
}
