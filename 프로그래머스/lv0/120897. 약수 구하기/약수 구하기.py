def solution(n):
    answer = []
#약수 -> 1~n까지의 숫자로 n을 나눴을 때 나머지가 0이 되도록
#for i in range(1,n+1): if n%i==0 answer += n//i
    for i in range(1, n+1):
        if n%i==0:
            answer.append(i)
            
    return answer