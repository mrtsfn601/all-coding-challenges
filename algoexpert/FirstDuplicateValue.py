# O(n) time | O(n) space where n in the number of elements in the array
def firstDuplicateValue(array):
    visited = set()
    for num in array:
        if num in visited:
            return num
        visited.add(num)
    return -1
