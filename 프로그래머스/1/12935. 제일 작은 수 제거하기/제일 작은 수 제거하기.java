import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
       // int[] answer = {};
        
        //배열 길이가 1일 때
        if (arr.length == 1) {
           int [] answer = {-1};
            return answer;
        }
        
        //배열 길이가 1보다 클 때
        int [] answer = new int [arr.length -1];
        //count
        int count = 0;
        //for문 사용 -> min 값?
        int min  = arr[0];
        for (int i = 0; i < arr.length; i++) {
        min = Math.min(min, arr[i]);
        }
        //반복문 사용해 값 담기
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == min) {
        continue;
        }
        answer[count++] = arr[i];
        }
        
        return answer;
    }
}