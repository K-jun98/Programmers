class Solution {
    boolean solution(String s) {
        char[] arr = s.toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                count++;
            } else if (arr[i] == ')' && count != 0) {
                count--;
            } else if (arr[i] == ')' && count == 0) {
                return false;
            }
        }
        return count == 0 ? true : false;
    }
}
