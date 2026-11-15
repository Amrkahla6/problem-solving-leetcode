import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){

        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
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
