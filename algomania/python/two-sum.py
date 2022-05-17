#Fonte: https://algomania.com.br/coding/two-sum/
def solution(numbers, target_sum):
    mapa = {}
    for n in numbers:
        y = target_sum - n
        if y in mapa:
            return [y, n]
        else:
            mapa[n] = True
    return []