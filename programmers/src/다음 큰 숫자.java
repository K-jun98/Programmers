class Solution {
    public static int solution(int n) {
        int temp = n+1;
        String str = Integer.toBinaryString(n);
        int strLength = str.replace("0","").length();


        while(strLength != Integer.toBinaryString(temp).replace("0","").length()){
            temp+=1;
        }
        return temp;
    }
}
