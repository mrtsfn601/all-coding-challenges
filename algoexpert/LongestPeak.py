# O(n) time | O(1) space where n is the length of the array
def longestPeak(array):
    longest = 0
    current = 0
    asc = False
    dsc = False
    for i in range(1, len(array)):
        if array[i-1] < array[i]:
            if dsc:
                current = 0
            asc = True
            dsc = False
        elif array[i-1] > array[i]:
            if not dsc and current != 0:
                asc = False
                dsc = True
        else:
            asc = False
            dsc = False
            current = 0
        if asc:
            current = 2 if current == 0 else current + 1
        elif dsc:
            current +=  1
            if longest < current:
                longest = current
    return longest


# O(n) time | O(1) space where n is the length of the array
def longestPeak(array):
    longest, current = 0, 0
    asc, dsc = False, False
    
    for i in range(1, len(array)):
        # if increasing
        if array[i-1] < array[i]:
            # reset after previous peak
            if dsc:
                current = 0
            asc = True
            dsc = False
            # count 2 numbers for the initial increase
            current = 2 if current == 0 else current + 1
        # if decreasing
        elif array[i-1] > array[i]:
            # and previosly was increasing
            if current != 0:
                asc = False
                dsc = True
                current +=  1
                # record new longest peak
                if longest < current:
                    longest = current
        # if flat - reset
        else:
            asc = False
            dsc = False
            current = 0

    return longest
