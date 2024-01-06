# O(n^3) time | O(n) space
def threeNumberSum(array, targetSum):
    res = []
    a = sorted(array)
    for i in range(len(a) - 2):
        for j in range(i + 1, len(a) - 1):
            for k in range(j + 1, len(a)):
                if (a[i] + a[j] + a[k]) == targetSum:
                    res.append([a[i], a[j], a[k]])
    return res


# O(n^3) time | O(n) space
def threeNumberSum(array, targetSum):
    res = []
    array.sort()
    for i in range(len(array) - 2):
        for j in range(i + 1, len(array) - 1):
            for k in range(j + 1, len(array)):
                if (array[i] + array[j] + array[k]) == targetSum:
                    res.append([array[i], array[j], array[k]])
    return res


# O(n^2) time | O(n) space
def threeNumberSum(array, targetSum):
    res = []
    array.sort()
    for i in range(len(array) - 2):
        left = i + 1
        right = len(array) - 1
        while left < right:
            currSum = array[i] + array[left] + array[right]
            if currSum == targetSum:
                res.append([array[i], array[left], array[right]])
                left += 1
                right -= 1
            elif currSum < targetSum:
                left += 1
            elif currSum > targetSum:
                right -= 1    
    return res
