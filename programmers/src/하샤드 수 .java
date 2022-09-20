import java.util.Arrays;

class Solution {
    public boolean solution(int x) {

        int value =  Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();
        return x%value==0;
    }
}