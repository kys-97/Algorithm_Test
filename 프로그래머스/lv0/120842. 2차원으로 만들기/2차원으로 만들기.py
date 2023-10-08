def solution(num_list, n):
    answer = []
    
    #n개씩 잘라서 배열에 넣기 -> for문
    #n, n+1 씩 append -> *i 해서 반복문 돌아가는 만큼 들어가도록
    #반복문 돌아가는 횟수 = numlist를 n으로 나눈 몫
    for i in range(len(num_list)//n):
        answer.append(num_list[i*n : n*(i+1)])
    return answer