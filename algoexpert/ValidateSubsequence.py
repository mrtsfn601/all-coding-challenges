def isValidSubsequence(array, sequence):
    arrayLen = len(array)
    sequenceLen = len(sequence)
    if arrayLen < sequenceLen:
        return False
    i = 0
    j = 0
    while i < arrayLen and j < sequenceLen:
        if array[i] == sequence[j]:
            if j == sequenceLen - 1:
                return True
            i += 1
            j += 1
            continue
        i += 1
    return False
