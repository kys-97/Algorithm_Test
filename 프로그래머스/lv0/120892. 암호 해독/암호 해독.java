class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String [] div = cipher.split("");
        for (int i = code; i <=cipher.length(); i++) {
            if (i%code==0) {
                answer += div[i-1];
            }
        }
        return answer;
    }
}