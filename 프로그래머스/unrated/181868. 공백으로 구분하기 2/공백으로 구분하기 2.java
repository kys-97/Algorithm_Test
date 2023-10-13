class Solution {
    public String[] solution(String my_string) {
        //split("\s+") 메서드를 사용하여 공백을 기준으로 문자열을 분리합니다. "\s+"는 하나 이상의 공백을 의미
        String[] answer = my_string.trim().split("\\s+");;
        return answer;
    }
}