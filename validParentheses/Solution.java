package validParentheses;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        boolean valid_1 = isValid("()");
        boolean valid_2 = isValid("()[]{}");
        boolean valid_3 = isValid("(]");
        System.out.println(valid_1);
        System.out.println(valid_2);
        System.out.println(valid_3);
    }

    public static boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(' ||ch=='{' || ch=='[')
            {
                stack.push(ch);
            }
            else if(ch==')')
            {
                if(stack.isEmpty() || stack.pop()!='(')
                    return false;
            }
            else if(ch=='}')
            {
                if(stack.isEmpty()||stack.pop()!='{')
                    return false;
            }
            else if(ch==']')
            {
                if(stack.isEmpty()||stack.pop()!='[')
                    return false;
            }
            else
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
