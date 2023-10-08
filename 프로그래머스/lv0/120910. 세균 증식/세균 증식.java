class Solution {
    public int solution(int n, int t) {
   //     int answer = 0;
//         for (int i = 0; i <t; i++) {
//             n *= 2;
            
//         }
//         answer = n;
        
        int answer = n*(int)Math.pow(2,t);
        return answer;
    }
}