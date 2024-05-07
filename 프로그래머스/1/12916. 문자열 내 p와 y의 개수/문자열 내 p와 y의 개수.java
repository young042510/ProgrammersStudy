class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int cntP = 0;
        int cntY = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p') cntP++;
            if (ch == 'y') cntY++;
        }
        
        return cntP == cntY ? true : false;
        
 
    }
}