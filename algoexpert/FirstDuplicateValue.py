# O(n) time | O(n) space where n in the number of elements in the array
def firstDuplicateValue(array):
    visited = set()
    for num in array:
        if num in visited:
            return num
        visited.add(num)
    return -1


# O(n) time | O(1) space where n in the number of elements in the array
def firstDuplicateValue(array):
    for val in array:
        absVal = abs(val)
        if array[absVal - 1] < 0:
            return absVal
        array[absVal - 1] *= -1
    return -1
