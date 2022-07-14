public class Solution {

    public static void main(String[] args) {
    }

    public int solution(int[] nums) {
        int[] ints = new int[3001];
        for (int i = 2; i <= Math.sqrt(3001); i++) {
            if (ints[i] == 0) {
                for (int j = i + i; j <= 3001; j += i) {
                    ints[j] = 1;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (ints[nums[i] + nums[j] + nums[k]] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
