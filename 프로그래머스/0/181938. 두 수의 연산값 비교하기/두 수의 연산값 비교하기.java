class Solution {
    public int solution(int a, int b) {
        String answer = Integer.toString(a)            + Integer.toString(b);
        int result = Integer.valueOf(answer);
       if(result>=2*a*b){
           return result;
       }else{
            return 2*a*b; 
       }
    
    }
}