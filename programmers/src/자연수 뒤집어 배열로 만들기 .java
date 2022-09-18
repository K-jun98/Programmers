class Solution {

    public int[] solution(long n) {

        String str = Long.toString(n);

        int[] answer = new int[str.length()];

        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            answer[j] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
}