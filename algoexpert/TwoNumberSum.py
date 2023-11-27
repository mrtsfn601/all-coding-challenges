# O(n*2) time | O(1) space
def twoNumberSum(array, targetSum):
    for i in range(len(array)):
        for j in range(i+1,len(array)):
            if array[i] + array[j] == targetSum:
                return [array[i], array[j]]
    return []

# O(n) time | O(n) space
def twoNumberSum(array, targetSum):
    visited = set()
    for num in array:
        if (targetSum - num) in visited:
            return [targetSum - num, num]
        visited.add(num)
    return []

# O(n log(n)) time | O(1) space
def twoNumberSum(array, targetSum):
    array.sort()
    left = 0
    right = len(array) - 1
    while left < right:
        currSum = array[left] + array[right]
        if currSum == targetSum:
            return [array[left], array[right]]
        elif currSum < targetSum:
            left += 1
        elif currSum > targetSum:
            right -= 1
    return []
