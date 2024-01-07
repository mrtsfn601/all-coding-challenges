# O(n^2) time | O(1) space
def smallestDifference(arrayOne, arrayTwo):
    smallest = abs(arrayOne[0] - arrayTwo[0])
    res = [arrayOne[0], arrayTwo[0]]
    for num1 in arrayOne:
        for num2 in arrayTwo:
            current = abs(num1 - num2)
            if current < smallest:
                smallest = current
                res = [num1, num2]
    return res


# O(nlog(n) + mlog(m)) time | O(1) space
def smallestDifference(array1, array2):
    array1.sort()
    array2.sort()
    smallest, res = float("inf"), []
    i, j = 0, 0
    while i < len(array1) and j < len(array2):
        current = abs(array1[i] - array2[j])
        if current < smallest:
            smallest = current
            res = [array1[i], array2[j]]
            if current == 0:
                return res
        if array1[i] < array2[j]:
            i += 1
        else:
            j += 1
    return res
