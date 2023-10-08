class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        //팩토리얼값이 n 이하여야 함
        while (fac <= n) {
            answer ++;
            //answer가 1~n까지 ++ -> factorial 계산한 값을 fac에 담기 계산 결과가 n과 같거나 작아야 하는데, fac 값을 기준으로 하고 있으므로 answer값에 -1
            fac = answer * fac;
        }
        return answer-1;
    }
}