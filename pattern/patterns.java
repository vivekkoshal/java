package pattern;

public class patterns {
    public static void main(String[] args) {
        Pattern7(6);

    }

    static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            int p = 1;

            for (int j = 0; j < i; j++) {
                System.out.print(p + "  ");
                p++;
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {

            if (i < 4) {
                for (int col = 0; col < n; col++) {
                    if (col < n - i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("* ");
                    }

                }

                System.out.println();
            } else {
                for (int col = 0; col < n; col++) {
                    if (col < n + i - (2 * n - 1)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("* ");
                    }

                }

                System.out.println();
            }

        }
    }

    static void Pattern6(int n) {
        for (int i = 0; i < n ; i++) {
                for (int col = 0; col < 2*n; col++) {
                    if (col < n - i ) {
                        System.out.print(" ");
                    }

                    else if (col > n+i ){
                        break;
                    }

                    else {
                        if(col<n+1){
                            System.out.print(n-col+1 );
                        }
                        else{
                            System.out.print(col-n+1);
                        }

                    }


                }

                System.out.println();



        }
    }

    static void Pattern7(int n ){
        n= 2*n;
        for (int i = 0 ; i <=n; i++ ){
            for(int col = 0 ; col<= n ; col++){
            int ind = Math.min(Math.min(i,col), Math.min(n-i ,n-col));
                System.out.print(ind + " ");
            }
            System.out.println();
        }



    }


}