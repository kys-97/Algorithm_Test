import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0]; //첫번째 (가장 작은 수)
        for (int i = 0; i< array.length; i++) {
            //answer-n 과 array[i]-n의 값 비교
            //answer -nqhek array[i]-n이 더 작을 경우 answer = array[i]
            if (Math.abs(answer-n) > Math.abs(array[i]-n)) {
                answer = array[i];
            }
        }
        return answer;
    }
}