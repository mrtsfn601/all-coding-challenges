# O(n) time | O(1) space
def bestSeat(seats):
    idx = -1
    max_empty, curr_empty = 0, 0
    for i, num in enumerate(seats):
        if num == 0:
            curr_empty += 1
        else: # num == 1
            if max_empty < curr_empty:
                max_empty = curr_empty
                idx = i - (max_empty // 2 + 1)
            curr_empty = 0
            if (len(seats) - i + 1) < max_empty:
                break
    return idx


# O(n) time | O(1) space
def bestSeat(seats):
    idx = -1
    max_empty, curr_empty = 0, 0
    i = 0
    while i < len(seats):
        while i < len(seats) and seats[i] == 1:
            i += 1
        while i < len(seats) and seats[i] == 0:
            curr_empty += 1
            i += 1
        if max_empty < curr_empty:
            max_empty = curr_empty
            idx = i - (max_empty // 2 + 1)
        curr_empty = 0
    return idx
  
