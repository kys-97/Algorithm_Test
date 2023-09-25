import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 0;
        int a =  numbers[numbers.length-1]* numbers[numbers.length-2];
        int b =  numbers[0]* numbers[1];
        if (a>b) {
            answer = a;
        }
        else {
            answer = b;
        }
        
        return answer;
    }
}