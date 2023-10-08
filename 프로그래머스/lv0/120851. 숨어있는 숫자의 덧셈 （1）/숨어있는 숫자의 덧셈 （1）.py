def solution(my_string):
    answer = 0
    #isnumeric() 함수는 숫자값 표현에 해당하는 문자열까지 인정한다. 제곱근 및 분수, 거듭제곱 특수문자도 isnumeric() 함수는 True를 반환
    answer = sum(int(i) for i in my_string if i.isnumeric())
    return answer