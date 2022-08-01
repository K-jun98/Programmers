class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            if(judge(i)){
                answer-=i;
            }else{
                answer+=i;
            }
        }
        return answer;
    }

    public static boolean judge(int value){
        int X = (int)Math.sqrt(value);
        if(value==Math.pow(X,2)){
            return true;
        }else{
            return false;
        }
    }
}