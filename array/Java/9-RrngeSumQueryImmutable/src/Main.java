//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        NumArray numArray = new NumArray(
                new int[]{-2,0,3,-5,2,-1}
        );

        int queryOne = numArray.sumRange(0,2);
        System.out.println(queryOne);

        int queryTwo = numArray.sumRange(2,5);
        System.out.println(queryTwo);

        int queryThree = numArray.sumRange(0,5);
        System.out.println(queryThree);
    }
}
