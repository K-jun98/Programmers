import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = new int[]{6, 6, 5, 4, 3, 2, 1};
        List<Integer> list = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int contains = 0;
        int zero = 0;
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
            } else if (list.contains(lottos[i])) {
                contains++;
            }
        }
        return new int[] {rank[contains+zero], rank[contains]};
    }
}
