class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        //k -> string
        String K = String.valueOf(k);
        for (int a = i; a <=j; a++) {
            String str = String.valueOf(a);
            if (str.contains(K)) {
                String [] arr = str.split("");
                for (int b = 0; b<arr.length; b++) {
                    if (arr[b].equals(K)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}