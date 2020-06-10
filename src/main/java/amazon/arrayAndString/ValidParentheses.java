package amazon.arrayAndString;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> partnerMap = Map.of(')','(', ']', '[', '}','{');
        Stack<Character> stack = new Stack<>();
        for(var c : s.toCharArray()) {
            if(stack.isEmpty() || stack.lastElement() != partnerMap.get(c)) {
                stack.push(c);
            }
            else  {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
