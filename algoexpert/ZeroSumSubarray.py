# O(n^2) time | O(1) space
def zeroSumSubarray(nums):
    for i in range(len(nums)):
        sum = 0
        for j in range(i, len(nums)):
            sum += nums[j]
            if sum == 0:
                return True
    return False


# O(n) time | O(n) space
def zeroSumSubarray(nums):
    curr_sum, pre_sums = 0, {0}
    for num in nums:
        curr_sum += num
        if curr_sum in pre_sums:
            return True
        pre_sums.add(curr_sum)
    return False
