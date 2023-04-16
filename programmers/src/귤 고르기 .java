import java.util.*;


class Solution {
    public int solution(int k, int[] tarr) {
        int answer = 0;
        int[] arr = new int[10_000_001];

        for (int i = 0; i < tarr.length; i++) {
            arr[tarr[i]]++;
        }

        List<Integer> list = new ArrayList();

        for (Integer i : arr) {
            list.add(i);
        }

        Collections.sort(list, Collections.reverseOrder());
        int n = 0;
        for (Integer i : list) {
            if (n < k) {
                answer++;
                n += i;
                continue;
            }
            return answer;
        }
        return answer;
    }
}
