import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] answer = s.toCharArray();
        Arrays.sort(answer);
        return new StringBuilder(String.valueOf(answer)).reverse().toString();
    }
}
