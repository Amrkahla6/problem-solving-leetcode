import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){
        int [] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        List<Integer> missing = new ArrayList<Integer>();

        for (int n : nums){
            set.add(n);
        }

        for (int i=1; i <= nums.length; i++){
            if (!set.contains(i)){
                missing.add(i);
            }
        }

        return missing;
    }
}
