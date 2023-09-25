import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        //my_string을 쪼개서 담을 문자열 배열 만들기
        String [] str = my_string.split("");
        //반복문 사용
        for (int i = 0; i < my_string.length(); i++) {
            //answer에 값 더하기
            answer += str[i].repeat(n);
        }
        return answer;
    }
}