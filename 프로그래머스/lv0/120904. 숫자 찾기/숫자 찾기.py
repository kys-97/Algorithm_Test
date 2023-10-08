def solution(num, k):
    answer = 0
    #문자열로 바꾸면 find()함수로 찾을수 있다  / 같은 숫자가 없다면 자동으로 -1을 반환해준다.
    if str(k) in str(num):
        answer = str(num).find(str(k)) +1
    else:
        answer = str(num).find(str(k))
    return answer