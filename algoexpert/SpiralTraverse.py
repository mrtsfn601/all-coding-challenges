# O(n) time | O(n) space where n is total number of elements in the array
def spiralTraverse(array):
    res = []
    # top, right, bottom, left
    t, r, b, l = 0, len(array[0]) - 1, len(array) - 1, 0
    
    while l <= r and t <= b:
        
        for col in range(l, r + 1):
            res.append(array[t][col])
        
        for row in range(t + 1, b + 1):
            res.append(array[row][r])

        for col in reversed(range(l, r)):
            if t == b:
                break
            res.append(array[b][col])

        for row in reversed(range(t + 1, b)):
            if l == r:
                break
            res.append(array[row][l])
        t += 1
        r -= 1
        b -= 1
        l += 1
    return res
