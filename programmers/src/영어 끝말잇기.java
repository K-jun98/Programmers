import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList();
        char ch = words[0].charAt(0);
        int front = 0;
        int back = 1;

        for (String word : words) {
            front++;
            if (front > n) {
                front = 1;
                back++;
            }

            if (ch != word.charAt(0) || list.contains(word)) {
                answer[0] = front;
                answer[1] = back;
                return answer;
            } else if (ch == word.charAt(0)) {
                ch = word.charAt(word.length() - 1);
                list.add(word);
                continue;
            }
        }
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }
}
