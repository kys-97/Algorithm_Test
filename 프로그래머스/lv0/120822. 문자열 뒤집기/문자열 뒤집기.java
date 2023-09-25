class Solution {
    public String solution(String my_string) {
        String answer = "";
        //i의 값이 문자열의 길이 -1 과 같을 때, i가 0과 같거나 커질 때까지 i의 값을 -1 한다.
        for (int i = my_string.length()-1; i>=0; i--) {
            //answer에 subString(index 1, index2) 를 통해 answer가 my_string의 길이만큼
            //반복 될 동안 잘라낸 값을 집어넣음 ->my_string의 뒤에서부터 들어가도록
            answer += my_string.substring(i, i+1);
        }
        return answer;
    }
}