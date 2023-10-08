def solution(str1, str2):
    answer = 0
    #if str2가 str1에 속해있다면?
    if str2 in str1:
        answer = 1
    else:
        answer = 2
    return answer