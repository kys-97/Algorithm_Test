class Solution {
    public String solution(String my_string) {
       // String answer = "";
        //모음 배열
        String [] a = {"a","e","i","o","u"};
        for (int i = 0; i <a.length; i++) {
            //boolean contains(CharSequence s)
            //contains() 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
            if(my_string.contains(a[i])) {
                //String replace(CharSequence target, CharSequence replacement)
                //replace() 함수는 대상 문자열을 원하는 문자 값으로 변환하는 함수
                my_string = my_string.replaceAll(a[i],"");
            }
            
        }
        return my_string;
    }
}