import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){

        int [] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0; //-4
        int right = nums.length - 1; //10
        int [] result = new int[nums.length];
        int position = nums.length - 1;

        while (left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];


            if (leftSquare > rightSquare){
                result[position] = leftSquare;
                left++;
            }else {
                result[position] = rightSquare;
                right--;
            }

            position--;
        }

        return result;
    }
}
