import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){
        int [] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }


    public static int searchInsert(int[] nums, int target) {
       int left = 0;
       int right = nums.length-1;

       while(left <= right){
           int mid = (left+right)/2;

           if(nums[mid] == target){
               return mid;
           }

           if (nums[mid] < target) {
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }

       return left;
    }

}