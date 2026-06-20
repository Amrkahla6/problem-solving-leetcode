import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters,target));
    }


    public static char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++){
            if (letters[i] > target){
                return letters[i];
            }
        }

        return letters[0];
    }
}