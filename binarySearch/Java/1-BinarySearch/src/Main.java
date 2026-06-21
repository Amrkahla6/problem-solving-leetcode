import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){
        int [] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums,target));
    }


    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return -1;
    }
}