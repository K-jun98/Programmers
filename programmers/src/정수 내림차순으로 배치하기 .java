import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] chars = Long.toString(n).toCharArray();
        Arrays.sort(chars);
        String sb = new StringBuilder(new String(chars)).reverse().toString();
        return Long.parseLong(sb);
    }

}