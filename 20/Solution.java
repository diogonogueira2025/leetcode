import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c == '(' || c == '{' || c == '['){
                stack.add(c);
            } else {
                if(stack.size() > 0){
                    if(c == map.get(stack.peek())){
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        
        if(stack.size() > 0){
            return false;
        }
        return true;
    }
}