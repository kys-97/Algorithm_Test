class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        answer = sum - answer;
        return answer;
    }
}