class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //정규표현식 사용해 문자가 아닌 것 추출
        String [] num = my_string.replaceAll("[^0-9]"," ").split(" ");
        for (int i = 0; i < num.length; i++) {
            if (num[i].equals("")) {
                continue;
            }
            else {
                answer += Integer.parseInt(num[i]);
            }
        }
        return answer;
    }
}