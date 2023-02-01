import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        return (int) Arrays.stream(my_string.toLowerCase().replaceAll("[a-z]", "").split(""))
                .mapToInt(Integer::parseInt).sum();

    }
}