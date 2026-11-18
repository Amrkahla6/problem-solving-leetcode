import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){

        Map<String,Integer> map = new HashMap<>();

        String key = "java";
        map.put(key,100);

        key = key + "developer";

        System.out.println(map.get(key));
        System.out.println(map.get("java"));
    }

    public static boolean isSubsequence(String s, String t) {

        int i = 0; //pointer for s
        int j = 0; // pointer for t

        while (j < t.length()){
            if ( i < s.length() && s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
