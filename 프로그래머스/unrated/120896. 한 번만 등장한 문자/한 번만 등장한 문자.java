import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String [] str = s.split("");
        Arrays.sort(str);
        int cnt;
        for (int i =0; i < str.length; i++) {
            cnt = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                answer += str[i];
            }
        }
        return answer;
    }
}