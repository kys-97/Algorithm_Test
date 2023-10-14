class Solution {
    public String solution(String my_string, String alp) {
        char a = alp.charAt(0);
        int index = 0;
        char [] arr = my_string.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                answer.append(Character.toUpperCase(arr[i]));
            }
            else {
                answer.append(arr[i]);
            }
        }
        return answer.toString();
    }
}