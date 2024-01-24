import java.util.Arrays;

public class advqun{
    public static void main(String[] args) {
        int[] arr= {-1 , 1 , 3 ,4 ,5};
        int ans= pro(arr);
        System.out.println(ans);
    }

    static int pro(int[] nums){
        int min = 1 ;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length ; i++){
            if(min == nums[i]){
                min++;
            }

        }
        return min;

    }








}


