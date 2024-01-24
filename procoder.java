public class procoder {
    public static void main(String[] args) {
        System.out.println(freq("2343333444422221111111999999999999999999999990000000000000000"));



    }

    public static int freq(String n){
        int[] arr = new int[10];

        for (int i =0 ; i<n.length() ; i++){
            if(n.charAt(i)=='0'){
                arr[0] = arr[0] +1 ;
            }
            if(n.charAt(i)=='1'){
                arr[1] = arr[1] +1 ;
            }
            if(n.charAt(i)=='2'){
                arr[2] = arr[2] +1 ;
            }
            if(n.charAt(i)=='3'){
                arr[3] = arr[3] +1 ;
            }
            if(n.charAt(i)=='4'){
                arr[4] = arr[4] +1 ;
            }
            if(n.charAt(i)=='5'){
                arr[5] = arr[5] +1 ;
            }
            if(n.charAt(i)=='6'){
                arr[6] = arr[6] +1 ;
            }
            if(n.charAt(i)=='7'){
                arr[7] = arr[7] +1 ;
            }

            if(n.charAt(i)=='8'){
                arr[8] = arr[8] +1 ;
            }
            if(n.charAt(i)=='9'){
                arr[9] = arr[9] +1 ;
            }

        }

        int index = 0 ;
        for (int i = 0; i < 9; i++) {
            if(arr[i+1]>arr[i]){
                index = i+1 ;
            }
        }
        return index;



    }





}
