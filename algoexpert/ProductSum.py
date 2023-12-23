# O(n) time | O(d) space
# where n is the number of elements and d is the depth
def productSum(array, product = 1):
    sum = 0
    for e in array:
        if isinstance(e, list):
            sum += productSum(e, product + 1)
        else:
            sum += e
    return sum * product


def productSum(array, product = 1):
    sum = 0
    for e in array:
        sum += e if type(e) == int else productSum(e, product + 1)
    return sum * product


def productSum(array, product = 1):
    return product * sum(e if isinstance(e, int) else productSum(e, product + 1) for e in array)
