import java.util.Arrays;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){
        int [] nums = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));
    }

    public static  int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i=0; i < nums.length; i++){
           if (i != nums[i]){
               return i;
           }
        }

        return nums.length;
    }
}
