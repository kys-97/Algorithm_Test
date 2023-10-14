class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        char [] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                answer.append(arr[i]);
            }
            else {
                answer.append(Character.toUpperCase(arr[i]));
            }
        }
        return answer.toString();
    }
}