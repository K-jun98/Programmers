import java.util.ArrayList;
import java.util.List;

class Solution {
    private static List<String> list = new ArrayList<>();
    private static String[] words = {"A", "E", "I", "O", "U"};

    static void dfs(String str, int len) {
        list.add(str);
        if (len == 5) return;
        for (int i = 0; i < 5; i++) {
            dfs(str + words[i], len + 1);
        }
    }

    public int solution(String word) {
        int answer = 0;
        dfs("", 0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
