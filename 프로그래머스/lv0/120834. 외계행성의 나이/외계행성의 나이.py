def solution(age):
    answer = ''
    #우주행성 식 나이 연산 리턴
    #알파벳 담긴 리스트
    num = ['a','b','c','d','e','f','g','h','i','j']
    #나이를 str로 변환
    for i in str(age):
        answer += num[int(i)]
    return answer