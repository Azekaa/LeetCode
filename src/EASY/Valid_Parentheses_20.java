package EASY;

import java.util.Stack;

public class Valid_Parentheses_20 {
    public static void main(String[] args) {
        String str = "([}}])";
        System.out.println(isValid(str));

    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                stack.push(')');
            else if (str.charAt(i) == '{') {
                stack.push('}');
            } else if (str.charAt(i) == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != str.charAt(i)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
//        Map<Character, Character> map = new HashMap<>();
//        map.put(')', '(');
//        map.put('}', '{');
//        map.put(']', '[');
//
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            if (map.containsValue(str.charAt(i))) {
//                stack.push(str.charAt(i));
//            } else if (map.containsKey(str.charAt(i))) {
//                if (stack.isEmpty() || stack.pop() != map.get(str.charAt(i))) return false;
//            }
//        }
//        return stack.isEmpty();
//    }
}