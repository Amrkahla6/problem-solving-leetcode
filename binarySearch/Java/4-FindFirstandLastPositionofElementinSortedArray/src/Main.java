import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){
            // index   0 1 2 3 4 5
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int first = findFirst(nums, target);
        int last = findLast(nums, target);


        int [] result = {first,last};

        return result;
    }

    private static int findFirst(int[] nums, int target){

        int left = 0; // 0
        int right = nums.length-1; // 5

        while(left <right ){
            int mid = left + (right - left) / 2; // 7

            // 7 < 8

            if(nums[mid] == target){
                right = mid; // {8,8} left = 3 right = 4
            }else if(nums[mid] < target){
                left = mid + 1; //{8,8,10} // left = 3  right = 5 nums[mid]=8
            }else {
                right = mid - 1;
            }

        }

        if (left >= nums.length || nums[left] != target) {
            return -1;
        }

        return left;
    }
    private static int findLast(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right - left + 1) / 2;
            if(nums[mid] == target){
                left = mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else  {
                right = mid - 1;
            }
        }

        if (left >= nums.length || nums[left] != target) {
            return -1;
        }

        return left;
    }
}
