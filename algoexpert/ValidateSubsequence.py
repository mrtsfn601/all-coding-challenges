# O(n) time | O(1) space
def isValidSubsequence(array, sequence):
    arrLen = len(array)
    seqLen = len(sequence)
    if arrLen < seqLen:
        return False
    i = 0 # array
    j = 0 # sequence
    while i < arrLen and j < seqLen:
        if array[i] == sequence[j]:
            if j == seqLen - 1:
                return True
            i += 1
            j += 1
            continue
        i += 1
        # potential optimization
        if arrLen - i < seqLen - j:
            return False
    return False

# O(n) time | O(1) space
def isValidSubsequence(array, sequence):
    arrLen = len(array)
    seqLen = len(sequence)
    if arrLen < seqLen:
        return False
    arrIdx = 0 # array
    seqIdx = 0 # sequence
    while arrIdx < arrLen and seqIdx < seqLen:
        if array[arrIdx] == sequence[seqIdx]:
            seqIdx += 1
        arrIdx += 1
    return seqIdx == seqLen
        
