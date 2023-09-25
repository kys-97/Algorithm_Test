class Solution {
    public String solution(String my_string) {
        String answer = "";
        //Character.toUpperCase(); / Character.isUpperCase();
        //CharAt() String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            }
            else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}