import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[][] ints = new int[n][n];
        int temp = 1;
        int x = 0;
        int y = 0;
        while (true) {

            while (true) {
                ints[y][x] = temp++;
                if (y + 1 == n || ints[y + 1][x] != 0) {
                    break;
                }
                y++;
            }
            if (x + 1 == n || ints[y][x + 1] != 0) {
                break;
            }
            x++;

            while (true) {
                ints[y][x] = temp++;
                if (x + 1 == n || ints[y][x + 1] != 0) {
                    break;
                }
                x++;
            }
            if (ints[y - 1][x - 1] != 0) break;
            y--;
            x--;

            while (true) {
                ints[y][x] = temp++;
                if (ints[y - 1][x - 1] != 0) {
                    break;
                }
                x--;
                y--;
            }
            if (y + 1 == n || ints[y + 1][x] != 0) {
                break;
            }
            y++;
        }

        return Arrays.stream(ints)
                .flatMapToInt(IntStream::of)
                .filter(a -> a != 0)
                .toArray();
    }

}
