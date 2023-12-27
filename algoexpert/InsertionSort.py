# Best: O(n) time | O(1) space
# Average: O(n^2) time | O(1) space
# Worst: O(n^2) time | O(1) space
def insertionSort(array):
    for i in range(1, len(array)):
        j = i
        while 0 < j and array[j-1] > array[j]:
            array[j-1], array[j] = array[j], array[j-1]
            j -= 1
    return array


def insertionSort(array):
    for i in range(1, len(array)):
        while 0 < i and array[i-1] > array[i]:
            array[i-1], array[i] = array[i], array[i-1]
            i -= 1
    return array
