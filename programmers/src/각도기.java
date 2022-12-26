class Solution {

    public int solution(int angle) {
        if (angle < 90 && 0 < angle) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        }
        return 4;
    }
}