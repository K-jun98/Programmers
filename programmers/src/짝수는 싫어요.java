import java.util.stream.IntStream;

class Solution {

    public int[] solution(int n) {
        return IntStream.iterate(0, i -> i + 1)
                .limit(n + 1)
                .filter(i -> i % 2 == 1)
                .toArray();
    }
}