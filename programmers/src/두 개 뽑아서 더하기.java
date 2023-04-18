import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
    }

    public Integer[] solution(int[] numbers) {
        Integer[] answer = {};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        answer = set.toArray(new Integer[set.size()]);
        Arrays.sort(answer);
        return answer;
    }
}
