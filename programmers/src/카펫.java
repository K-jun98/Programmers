class Solution {
    public int[] solution(int b, int y) {
        int sum = b + y;

        for (int i = 3; i < sum; i++) {
            if (sum % i == 0 && i >= sum / i && (i - 2) * (sum / i - 2) == y) {
                return new int[]{i, sum / i};
            }
        }
        return new int[]{0};
    }
}
