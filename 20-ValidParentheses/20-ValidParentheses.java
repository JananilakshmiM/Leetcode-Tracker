// Last updated: 09/07/2026, 15:13:11
class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
        if(c == '(') 
            stack.push(')'); 
        else if(c == '{')
            stack.push('}');
        else if(c == '[') 
            stack.push(']');
        else if(stack.isEmpty() || stack.pop() != c )
            return false;
        }
        return stack.isEmpty();


        
    }
}