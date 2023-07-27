class Solution {
    private static final int[] xArr = {0, 1, 0, -1};
    private static final int[] yArr = {-1, 0, 1, 0};

    private static boolean isDistenceOK(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 'P') {
                    if (checkAround(arr, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean checkAround(char[][] arr, int y, int x) {
        for (int i = 0; i < 4; i++) {
            int ny = y + yArr[i];
            int nx = x + xArr[i];
            if (ny >= 0 && ny < arr.length && nx >= 0 && nx < arr[ny].length) {
                if (arr[ny][nx] == 'O') {
                    if (isNextAround(arr, ny, nx)) {
                        return true;
                    }
                } else if (arr[ny][nx] == 'P') {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isNextAround(char[][] arr, int y, int x) {
        int check = 0;
        for (int i = 0; i < 4; i++) {
            int ny = y + yArr[i];
            int nx = x + xArr[i];
            if (ny >= 0 && ny < arr.length && nx >= 0 && nx < arr[ny].length) {
                if (arr[ny][nx] == 'P') {
                    check++;
                }
            }
        }
        return check >= 2 ? true : false;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            String[] strings = places[i];
            char[][] place = new char[strings.length][];
            for (int j = 0; j < strings.length; j++) {
                place[j] = strings[j].toCharArray();
            }
            // 거리두기 검사
            if (isDistenceOK(place)) {
                answer[i] = 0;
            } else {
                answer[i] = 1;
            }
        }
        return answer;
    }
}
