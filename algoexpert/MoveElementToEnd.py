# O (n) time | O(1) space where n is the length of the array
def moveElementToEnd(array, toMove):
    left = 0
    right = len(array) - 1
    while left < right:
        if array[right] == toMove:
            right -= 1
        elif array[left] == toMove:
            array[left], array[right] = array[right], array[left]
            left += 1
            right -= 1
        else:
            left += 1
    return array
