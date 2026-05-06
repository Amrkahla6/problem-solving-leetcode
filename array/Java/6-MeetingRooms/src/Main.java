import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        int[][] intervals = {
                {0, 30},
                {5, 10},
                {15, 20}
        };

        System.out.println(checkMeeting(intervals));
    }

    public static boolean checkMeeting(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       for (int i =1; i < intervals.length; i++){
          int currentStart = intervals[i][0];
          int previousEnd  = intervals[i - 1][1];

          if (currentStart < previousEnd){
              return false;
          }
       }
        return true;
    }
}
