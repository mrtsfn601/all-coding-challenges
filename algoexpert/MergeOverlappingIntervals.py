def mergeOverlappingIntervals(intervals):
    intervals.sort()
    completed = False
    
    while not completed:
        completed = True
        
        for i in range(len(intervals) - 1, 0, -1):
            prev = intervals[i-1]
            curr = intervals[i]
            if curr[0] <= prev[1]:
                prev[0] = min(prev[0], curr[0])
                prev[1] = max(prev[1], curr[1])
                completed = False
                intervals.pop(i)
        
    return intervals


# O(nlog(n)) time | O(1) space
def mergeOverlappingIntervals(intervals):
    intervals.sort(key = lambda x: x[1])

    for i in range(len(intervals) - 1, 0, -1): # loop backwards
        left_start, left_end = intervals[i-1]
        right_start, right_end = intervals[i]
        
        if right_start <= left_end: # merge left and delete right
            intervals[i-1][0] = min(left_start, right_start)
            intervals[i-1][1] = max(left_end, right_end)
            del intervals[i]
        
    return intervals


# O(nlog(n)) time | O(n) space
def mergeOverlappingIntervals(intervals):
    intervals.sort(key = lambda x: x[0])
    result = [intervals[0]]
    
    for start, end in intervals:
        if start <= result[-1][1]:
            result[-1][1] = max(result[-1][1], end)
        else:
            result.append([start, end])
            
    return result
