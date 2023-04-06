class Solution {
    public String solution(String s) {
        String a = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        String[] arr = a.split("");

        boolean bool = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                sb.append(arr[i]);
                bool = true;
            } else if (bool) {
                sb.append(arr[i].toUpperCase());
                bool = false;
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();

    }
}
