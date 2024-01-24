package OOPsAbstract;

public class daughter extends abt {

    public daughter(int age) {
        this.age = age;
    }

    @Override
     void career() {
        System.out.println("name is her");
    }

    @Override
    void partner() {
        System.out.println("Pater is his" + age);
    }
}
