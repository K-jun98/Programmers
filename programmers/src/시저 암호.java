class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == ' ') {
                answer += " ";
            } else if (ch >= 'a' && 'z' >= ch) {
                if (ch + n > 'z') {
                    answer += (char) (ch + n - 26);
                } else {
                    answer += (char) (ch + n);
                }
            } else if (ch >= 'A' && 'Z' >= ch) {
                if (ch + n > 'Z') {
                    answer += (char) (ch + n - 26);
                } else {
                    answer += (char) (ch + n);
                }
            }
        }
        return answer;
    }
}
