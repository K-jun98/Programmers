class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            int temp2 = i;
            while (temp < n) {
                temp += temp2;
                if (temp == n) {
                    answer++;
                }
                temp2++;
            }
        }
        return answer;
    }
}
