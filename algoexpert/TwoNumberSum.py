def twoNumberSum(array, targetSum):
    for i in range(len(array)):
        for j in range(i+1,len(array)):
            if array[i] + array[j] == targetSum:
                return [array[i], array[j]]
    return []

def twoNumberSum(array, targetSum):
    visited = set()
    for num in array:
        if (targetSum - num) in visited:
            return [targetSum - num, num]
        visited.add(num)
    return []
