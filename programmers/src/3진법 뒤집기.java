class Solution {
    public int solution(int n) {
        int answer;
        String base3 = "";
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            base3 = (n % 3) + base3;
            n /= 3;
        }

        base3 = sb.append(base3).reverse().toString();

        answer = Integer.parseInt(base3, 3);

        return answer;
    }
}