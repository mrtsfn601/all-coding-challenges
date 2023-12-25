# O(n*log(n)) time | O(log(n)) space
def findThreeLargestNumbers(array):
    largest = sorted(array[:3])
    for num in array[3:]:
        if num > largest[0]:
            largest[0] = num
            largest.sort()
    return largest
