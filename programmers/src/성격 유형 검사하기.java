import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        List<String> keys = Arrays.asList("R", "T", "C", "F", "J", "M", "A", "N");
        Map<String, Integer> map = new HashMap<>();
        keys.forEach(key -> map.put(key, 0));

        int[] score = new int[]{0, 3, 2, 1, 0, 1, 2, 3};

        for (int i = 0; i < survey.length; i++) {
            String[] arr = survey[i].split("");
            if (choices[i] < 4) {
                map.put(arr[0], map.get(arr[0]) + score[choices[i]]);
            }
            if (choices[i] > 3) {
                map.put(arr[1], map.get(arr[1]) + score[choices[i]]);
            }
        }
        String answer = "";
        for (int i = 0; i < keys.size(); i += 2) {
            answer += (map.get(keys.get(i)) < map.get(keys.get(i + 1))) ? keys.get(i + 1) : keys.get(i);
        }
        return answer;
    }
}
