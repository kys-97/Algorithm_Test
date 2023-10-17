class Solution {
    public int[] solution(int[] num_list, int n) {
        int [] answer;
        //조건: if num_list%n==0; else: num_list%n != 0
        if ((num_list.length%n)==0) {
            answer = new int [num_list.length/n];
        }
        else {
            answer = new int [(num_list.length/n)+1];
        }

        int cnt = 0;
        for (int i = 0; i < num_list.length; i+=n) {
            answer[cnt++] = num_list[i];
        }
        return answer;
    }
}