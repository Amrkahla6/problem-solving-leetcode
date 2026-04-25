//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){
        int [] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));

    }

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums){
            if (count == 0){
                candidate = num;
            }

            if (num == candidate){
                count ++;
            }else {
                count --;
            }
        }

        return candidate;
    }
}
