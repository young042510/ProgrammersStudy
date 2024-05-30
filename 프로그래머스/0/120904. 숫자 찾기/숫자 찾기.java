class Solution {
        public int solution(int num, int k) {
            int answer = 0;
            String str_num = Integer.toString(num);
            String[] arr = str_num.split("");
            for (int i = 0; i < str_num.length(); i++) {
                if(arr[i].equals(Integer.toString(k))){
                    return answer = i+1;
                }

            }
            return answer = -1;
        }
    }