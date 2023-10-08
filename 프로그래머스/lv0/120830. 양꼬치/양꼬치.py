def solution(n, k):
    answer = 0
    if n%10==0 and n//10 == k:
        answer = (12000*n)-(k*2000)
    else:
        answer = (12000*n)+(k*2000)-(n//10*2000)
    return answer