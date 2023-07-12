import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < moves.length; i++) {
            int cur = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                int temp = board[j][cur];
                if (temp != 0) {
                    list.add(temp);
                    if (list.size() > 1 && list.get(list.size()-2) == list.get(list.size()-1)) {
                        result++;
                        list.remove(list.size()-2);
                        list.remove(list.size()-1);
                        break;
                    }
                }
            }
        }
        return result;
    }
}
