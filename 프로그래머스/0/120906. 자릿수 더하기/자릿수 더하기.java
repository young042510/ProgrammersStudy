class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        
        for(int i = 0; i<s.length(); i++){
         answer += Integer.valueOf(s.substring(i,i+1));
        }
        
        return answer;
    }
}