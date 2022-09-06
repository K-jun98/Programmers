import java.util.*;

public class Solution {

    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int X = 10;
        for (int i : arr) {
            if (i!=X) {
                list.add(i);
                X=i;
            }
        }
        return list;
    }
}