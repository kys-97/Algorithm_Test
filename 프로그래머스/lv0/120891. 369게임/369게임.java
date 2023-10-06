class Solution {
    public int solution(int order) {
        int answer = 0;
        String [] arr = String.valueOf(order).split("");
        String [] a = {"3","6","9"};
        for (int i = 0; i <arr.length; i++) {
            for (int j=0; j<a.length; j++) {
                if (arr[i].equals(a[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}