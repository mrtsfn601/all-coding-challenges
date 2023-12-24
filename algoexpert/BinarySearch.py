# O(log(n)) time | O(log(n)) space
def binarySearch(array, target):
    return binarySearchHelper(array, target, 0, len(array)-1)


def binarySearchHelper(array, target, start, end):
    if start > end:
        return -1
      
    mid = (end + start) // 2
  
    if array[mid] == target:
        return mid
    if target < array[mid]:
        return binarySearchHelper(array, target, start, mid-1)
    if array[mid] < target:
        return binarySearchHelper(array, target, mid+1, end)

    return -1


# O(log(n)) time | O(1) space
def binarySearch(array, target):
    start = 0
    end = len(array)-1
    while start <= end:
        mid = (end + start) // 2
        if array[mid] == target:
            return mid
        elif target < array[mid]:
            end = mid-1    
        else:
            start = mid+1
    return -1
