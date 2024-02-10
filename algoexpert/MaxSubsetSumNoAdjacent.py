def maxSubsetSumNoAdjacent(array):
    currMax, prevMax = 0, 0
    for num in array:
        prevMax, currMax = currMax, max(currMax, prevMax + num)
    return currMax
