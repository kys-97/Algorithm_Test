class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        String [] arr = my_string.split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < index_list.length; j++) {
                answer.append(arr[index_list[j]]);
            }
            break;
        }
        return answer.toString();
    }
}