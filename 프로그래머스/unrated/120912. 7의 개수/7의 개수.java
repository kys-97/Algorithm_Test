import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] str = String.valueOf(Arrays.toString(array)).split("");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("7")) {
                answer ++;
            }
        }
        return answer;
    }
}