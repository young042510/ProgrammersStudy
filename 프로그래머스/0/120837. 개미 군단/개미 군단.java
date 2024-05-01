class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(true){
            int a1 = hp / 5 ;
            int a2 = (hp % 5) / 3 ;
            int a3 = (hp % 5) % 3 / 1 ;
            answer = a1 + a2 + a3;
            break;
        }
        return answer;
    }
}