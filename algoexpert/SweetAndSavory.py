# O (nlog(n)) time | O(1) space
def sweetAndSavory(dishes, target):
    best_pair = [0, 0]
    best_diff = float("inf")
    dishes.sort()
    l = 0               # left pointer
    r = len(dishes) - 1 # right pointer
    while l < r and dishes[l] < 0 and 0 < dishes[r]:
        curr_flavor = dishes[l] + dishes[r]
        if target < curr_flavor: # too savory
            r -= 1
            continue
        curr_diff = abs(target - curr_flavor)
        if curr_diff < best_diff:
            best_pair = dishes[l], dishes[r]
            best_diff = curr_diff
            if curr_flavor == target:
                return best_pair
        l += 1
    return best_pair
