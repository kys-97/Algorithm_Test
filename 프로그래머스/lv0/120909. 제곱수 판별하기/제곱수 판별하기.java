
class Solution {
    public int solution(int n) {
        int answer = 0;
        //제곱수 -> 제곱근으로 바꿨을 때 소수점이 없어야 함
        if(Math.sqrt(n)%1 == 0) {
            answer = 1;
        }
        else {
            answer = 2;
        }
        return answer;
    }
}