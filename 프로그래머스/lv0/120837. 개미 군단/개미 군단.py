def solution(hp):
    answer = 0
    
    #장군개미는 5의 공격력
    a = 5
    #병정개미는 3의 공격력
    b = 3
    #일개미는 1의 공격력
    c =1
    
    #if hp -> 23 -> 23/5의 몫: 4 a 23/5의 나머지: 3 / b의 몫
    #(hp//a)+(hp%a//b)+(hp%a//b%b//c)
    a_hp = hp//a
    b_hp = hp%a//b
    c_hp = hp%a%b//c
    
    answer = a_hp + b_hp + c_hp
    return answer