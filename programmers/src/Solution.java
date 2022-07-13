public class Solution {

    public static void main(String[] args) {
        System.out.println(solution(3,20,4));

    }

    public static long solution(int price, int money, int count) {
        long total = 0;
        for (int i = 1; i <= count; i++) {

            total += price*i;
        }
         return (money-total>=0) ? 0:total-money;
    }
}
