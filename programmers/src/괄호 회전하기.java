import java.util.Stack;

class Solution {
    public static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, s.length()) + s.substring(0, i);
            if (check(str.toString())) {
                answer++;
            }
        }
        return answer;
    }

    public static boolean check(String str) {
        Stack<Character> stack = new Stack();
        for (char c : str.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

}
