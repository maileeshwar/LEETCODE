import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int l = s.length();
        for(int i = 0;i<l;i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch =='[' || ch =='('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char pop = stack.pop();
                    if(ch ==']' && pop!='[' || ch =='}'&&pop!='{' || ch == ')' && pop != '(') return false;
                }                
            }
        }

        return stack.isEmpty();
    }
}