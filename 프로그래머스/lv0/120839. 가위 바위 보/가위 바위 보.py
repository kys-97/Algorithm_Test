def solution(rsp):
    answer = ''
    #이기는 경우 -> dict
    win = {'2':'0','0':'5','5':'2'}
    #for문 돌려서 answer에 값 담기
    for i in rsp:
        answer += win.get(i)
    return answer