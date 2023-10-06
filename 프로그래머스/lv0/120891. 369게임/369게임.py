def solution(order):
    answer = 0
    #order -> str
    #3,6,9 list
    l = ['3','6','9']
    #for i in order
    for i in str(order):
        if i in l:
            answer += 1
    return answer