class Solution {
    public String solution(int age) {
        String answer = "";
        String a = "abcdefghij";
        String [] arr = String.valueOf(age).split("");
        for (int i = 0; i < arr.length; i++) {
            answer += a.charAt(Integer.valueOf(arr[i]));
        }
        return answer;
    }
}