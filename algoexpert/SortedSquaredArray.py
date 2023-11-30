# O(n log(n)) time | O(n) space
def sortedSquaredArray(array):
    squared = [0] * len(array)
    i = 0
    while i < len(array):
        squared[i] = array[i] * array[i]
        i += 1
    squared.sort()
    return squared

# O(n log(n)) time | O(n) space
def sortedSquaredArray(array):
    squared = [0 for _ in array]
    for i in range(len(array)):
        squared[i] = array[i] * array[i]
    squared.sort()
    return squared

# O(n log(n)) time | O(n) space
def sortedSquaredArray(array):
    return sorted([num**2 for num in array])

# O(n) time | O(n) space
def sortedSquaredArray(array):
    size = len(array)
    squared = [0] * size
    i = size - 1
    left = 0
    right = size - 1
    while left <= right:
        leftCurr = array[left] * array[left]
        rightCurr = array[right] * array[right]
        if leftCurr <= rightCurr:
            squared[i] = rightCurr
            right -= 1
        else:
            squared[i] = leftCurr
            left += 1
        i -= 1
    return squared

# O(n) time | O(n) space
def sortedSquaredArray(array):
    squared = [0 for _ in array]
    left = 0
    right = len(array) - 1
    
    for i in reversed(range(len(array))):
        leftCurr = array[left] * array[left]
        rightCurr = array[right] * array[right]
        
        if leftCurr <= rightCurr:
            squared[i] = rightCurr
            right -= 1
        else:
            squared[i] = leftCurr
            left += 1
    
    return squared
