class Solution {
    public String solution(String rsp) {
        String answer = "";
        char scissor = '2';
        char rock = '5';
        char paper = '0';
        for(int i = 0; i <rsp.length(); i++){
            if(rsp.charAt(i) == scissor){
                answer += paper;
            }else if(rsp.charAt(i) == paper){
                answer += rock;
            }else {
                answer += scissor;
            }
        }
        return answer;
    }
}