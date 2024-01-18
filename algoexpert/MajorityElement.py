# O(n) time | O(1) space
def majorityElement(array):
    count = 0
    majority = array[0]
    for num in array:
        if count == 0:
            majority = num
        if majority == num:
            count += 1
        else:
            count -= 1
    return majority
