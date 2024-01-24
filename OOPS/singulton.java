package OOPS;

public class singulton {
    private singulton(){
    }
 // due to private word we cannot call the constructor outside hence no new objects can be made

    private static singulton instance ;
    public static  singulton getInstance(){
        if(instance == null){
            instance = new singulton();
        }
        return instance;
    }

}

class ne{

    public static void main(String[] args) {
        singulton obj = singulton.getInstance();
        singulton obj1 = singulton.getInstance();
        singulton obj2 = singulton.getInstance();
    }
}