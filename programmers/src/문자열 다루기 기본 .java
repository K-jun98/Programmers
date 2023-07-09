class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            if (judge(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean judge(String s) {
        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
