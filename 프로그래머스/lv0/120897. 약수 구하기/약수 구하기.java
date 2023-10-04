class Solution {
    public int[] solution(int n) {
        int[] answer;
        int cnt = 0;
      /*
      * 1. answer 배열에 cnt++된 값을 넣어 요소의 수 지정
      * 2. n을 i로 나눴을 때 나머지가 0이 되도록 하는 i의 값을 answer배열에 삽입
      * 3. answer 배열의 인덱스 번호가 될 변수 j -> ++사용
      * */
        for (int i = 1; i<=n; i++) {
            if (n%i == 0) {
                cnt++;
            }
        }
        answer = new int [cnt];
         for (int i = 1, j = 0; i<=n; i++) {
             if (n%i==0) {
                 answer[j] = i;
                 j++;
             }
         }
        return answer;
    }
}