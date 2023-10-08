def solution(n):
    answer = 0
    
    # pizza = 7 pieces
    # 사람: 15명 -> 15/7 = 2 ... 1 -> 몫 + 1
    if n%7 == 0:
        answer = n//7
    elif n%7 !=0:
        answer = n//7+1
    return answer