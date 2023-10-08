def solution(price):
    answer = 0
    discount = {0:1, 100000:0.95, 300000:0.9, 500000:0.8}
    for disP, disR in discount.items():
        if price >= disP:
            answer = int(price * disR)
    return answer