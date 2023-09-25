class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int cnt = 0;
        int cnt2 = 0;
        
        for (int i = 0; i<numlist.length; i++) {
            if (numlist[i]%n==0) {
                cnt++;
                answer = new int[cnt];
            }
        }
        
        for (int i = 0; i <numlist.length; i++) {
            if(numlist[i]%n==0) {
                answer[cnt2] = numlist[i];
                cnt2++;
            }
        }
        return answer;
    }
}