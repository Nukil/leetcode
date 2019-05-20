package algo.q_20;

import java.util.Stack;

/**
 * @author likun 2019/5/155:35 PM
 */
class Solution {
    public boolean isValid(String s) {
        if (null == s) {
            return false;
        }
        if ("".equals(s.trim())) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char c1 = stack.pop();
            switch (c1) {
                case '(':
                    if (')' != c) return false;
                    break;
                case '{':
                    if ('}' != c) return false;
                    break;
                case '[':
                    if (']' != c) return false;
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("[]"));
    }

}
