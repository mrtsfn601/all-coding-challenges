# Best/Average/Worst: O(n^2) time | O(1) space
def selectionSort(array):
    for i in range(len(array)-1):
        min = i
        for j in range(i + 1, len(array)):
            if array[min] > array[j]:
                min = j
        array[i], array[min] = array[min], array[i]
    return array
