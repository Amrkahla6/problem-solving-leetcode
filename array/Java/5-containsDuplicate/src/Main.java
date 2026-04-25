import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){
        int [] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i =0; i < nums.length -1; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
    }
}
