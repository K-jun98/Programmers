class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int reZero = 0;
        int cicle = 0;

        do {

            reZero += s.length() - s.replace("0", "").length();
            s = Integer.toBinaryString(s.replace("0", "").length());
            cicle++;
        } while (!s.equals("1"));

        answer[0] = cicle;
        answer[1] = reZero;
        return answer;
    }
}
