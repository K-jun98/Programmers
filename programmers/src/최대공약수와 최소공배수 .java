class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m),lcm(n,m)};
        return answer;
    }

    static int gcd(int a, int b) { //최대 공약수
        if (a < b) // 유클리드 호제법 조건
        {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) { // 유클리드 호제법
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int lcm(int a, int b) { //최소 공배수
        return a * b / gcd(a, b);
    }
}