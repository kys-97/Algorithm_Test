def solution(array, height):
    answer = 0
    count = []
    #머쓱이보다 키가 큰 사람 return
    for i in array:
        if i>height:
            answer+=1
    return answer