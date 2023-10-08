def solution(message):
    answer = 0
    #편지는 가로로 적음 -> 축하문구를 위한 편지지 최소 가로 길이 = message *2cm
    answer = len(message)*2
    return answer