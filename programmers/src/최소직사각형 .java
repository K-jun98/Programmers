class Solution {

    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        max = getMax(sizes, max);

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1] && min < sizes[i][1]) {
                min = sizes[i][1];
            } else if (sizes[i][0] < sizes[i][1] && min < sizes[i][0]) {
                min = sizes[i][0];
            }
        }
        return max*min;
    }

    private static int getMax(int[][] sizes, int max) {
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[0].length; j++) {
                if (max < sizes[i][j]) {
                    max = sizes[i][j];
                }
            }
        }
        return max;
    }
}

