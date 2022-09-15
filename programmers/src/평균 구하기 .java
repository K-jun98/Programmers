import java.util.Arrays;
class Solution {
    public Double solution(int[] arr) {

        return Arrays.stream(arr).mapToDouble(Double::valueOf).average().getAsDouble();
    }
}