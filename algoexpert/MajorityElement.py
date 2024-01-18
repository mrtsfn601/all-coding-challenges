# O((n/2)^2) time | O(1) space
def majorityElement(array):
    maj_val = array[0]
    maj_count = 0
    for i in range(len(array) // 2 + 1):
        curr_count = 0
        for j in range(i + 1, len(array)):
            if array[i] == array[j]:
                curr_count += 1
            if maj_count < curr_count:
                maj_count, maj_val = curr_count, array[i]
                if len(array) // 2 < maj_count:
                    return maj_val
    return maj_val


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
