def solution(money):
    answer = []
    coffee = 5500
    answer = [money//coffee, money%coffee]
    return answer