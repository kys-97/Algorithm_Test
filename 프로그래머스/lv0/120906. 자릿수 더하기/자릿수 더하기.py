def solution(n):
    answer = sum(int(i) for i in str(n) if i.isnumeric())
    return answer