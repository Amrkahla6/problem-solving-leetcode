import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args){

        String s = "a#c";
        String t = "b";
        System.out.println(backspaceCompare(s,t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = buildString(s);
        Stack<Character> stack2 = buildString(t);

        boolean flag = true;

       if (stack1.size() != stack2.size()){
           flag  = false;
           return flag;
       }

       while (!stack1.empty()){
           if (stack1.peek() == stack2.peek()){
               stack1.pop();
               stack2.pop();
           }else {
               flag = false;
               break;
           }
       }
       return flag;
    }

    public static Stack<Character> buildString(String c){
        Stack <Character> stack = new Stack<>();
        for (char ch : c.toCharArray()){
            if (ch != '#'){
                stack.push(ch);
            }else if (!stack.isEmpty()){
                stack.pop();
            }
        }

        return stack;
    }
}
