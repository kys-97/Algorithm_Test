def solution(cipher, code):
    answer = ''
    #cipher -> append -> code의 배수 -> i%code == 0
    #code의 배수만 찾으면 됨 -> for문 range(code, len(cipher))
    for i in range(code, len(cipher)+1):
        if i%code == 0:
            answer += cipher[i-1]
    return answer