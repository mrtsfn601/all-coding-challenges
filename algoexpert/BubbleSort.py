# Best: O(n) time | O(1) space
# Average: O(n^2) time | O(1) space
# Worst: O(n^2) time | O(1) space
def bubbleSort(array):
    i = 1
    end = len(array) - 1    
    while i <= end:
        while i <= end:   
            if array[i-1] > array[i]:
                array[i-1], array[i] = array[i], array[i-1]
            i += 1
        i = 1
        end -= 1
    return array


def bubbleSort(array):
    i = 1
    end = len(array) - 1    
    while i <= end:
        sorted = True
        while i <= end:   
            if array[i-1] > array[i]:
                array[i-1], array[i] = array[i], array[i-1]
                sorted = False
            i += 1
        if sorted:
            return array
        i = 1
        end -= 1
    return array


def bubbleSort(array):
    end = len(array)
    sorted = False
    while not sorted:
        i = 1
        end -= 1
        sorted = True
        while i <= end:   
            if array[i-1] > array[i]:
                array[i-1], array[i] = array[i], array[i-1]
                sorted = False
            i += 1
    return array
