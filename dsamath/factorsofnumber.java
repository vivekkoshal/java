package dsamath;

public class factorsofnumber {
    public static void main(String[] args) {
        fact(40);
    }
    
    static void fact(int n ){
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n% i == 0 ){
                if(n/i == i){
                    System.out.print(i);
                }
                else{
                System.out.print(i + " " + n/i + "  ");
                }
            }
        }
    }
}
