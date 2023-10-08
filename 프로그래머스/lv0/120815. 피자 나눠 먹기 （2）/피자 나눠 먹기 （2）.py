def solution(n):
    answer = 0
    pizza = 6
    #최소공배수 구하기
    #제한사항: 1~100
    #n * i % pizza == 0
    for i in range(1,101):
        if (n*i)%pizza==0:
            answer = (n*i)//pizza
            break
            
    return answer