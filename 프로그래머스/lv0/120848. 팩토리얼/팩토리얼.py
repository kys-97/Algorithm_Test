def solution(n):
    answer = 0
    fac = 1
    #answer에 1씩 더한 값을 넣기 -> factorial과 *
    #answer의 값 - 1
    while fac <= n:
        answer += 1
        fac = answer * fac
    answer = answer - 1
    return answer