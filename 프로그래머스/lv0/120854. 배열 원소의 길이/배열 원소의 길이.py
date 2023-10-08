def solution(strlist):
    answer = []
    
    #strlist -> answer.append(len(strlist's items))
    #strlist의 요소 i
    for i in strlist:
        #answer 배열에 i(strlist)의 길이 담기
        answer.append(len(i))
    #return answer
    return answer
        