package stack;

import java.util.Stack;

public class BalenceParantheses {
    public void isBalenced(String A){
        char[]c = A.toCharArray();
        Stack<Character>stack = new Stack<>();

        for(int i = 0;i<c.length;i++){

            if(stack.isEmpty()){
                stack.push(c[i]);
            }
            else {
                if (stack.peek() == ')') {
                    stack.pop();
                }
            }
        }


    }
}
