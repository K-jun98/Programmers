class Solution {
    boolean solution(String s) {
        s=s.toLowerCase();
        int value = 0;
        for(int i=0; i < s.length();i++){
            if(s.charAt(i)=='p'){
                value++;
            }else if(s.charAt(i)=='y'){
                value--;
            }
        }
        if(value==0)
            return true;
        else
            return false;
    }
}