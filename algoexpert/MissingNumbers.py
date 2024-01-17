# O(n) time | O(1) space
def missingNumbers(nums):
    missing = []
    # iterate thru expected numbers from 1 to n+2
    for num in range(1, len(nums) + 3):
        if num not in nums:
            missing.append(num)
            # stop as soon as 2 missing numbers are found
            if len(missing) == 2:
                break
    return missing
