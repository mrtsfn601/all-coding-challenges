def isMonotonic(array):
    return array == sorted(array) or array == sorted(array, reverse=True)


# O(n) time | O(1) space where n is the length of the array
def isMonotonic(array):
    asc = True
    dsc = True
    for i in range(1, len(array)):
        if array[i-1] < array[i]:
            dsc = False
        elif array[i-1] > array[i]:
            asc = False
        if not asc and not dsc:
            return False
    return True
