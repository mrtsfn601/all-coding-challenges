# O(n) time | O(1) space
def minimumWaitingTime(queries):
    min_wait_time = 0
    curr_wait_time = 0
    queries.sort()
    for q in queries:
        curr_wait_time += q
        min_wait_time += curr_wait_time
    return min_wait_time - curr_wait_time


# O(n) time | O(1) space
def minimumWaitingTime(queries):
    min_wait_time = 0
    curr_wait_time = 0
    queries.sort()
    for query in queries:
        min_wait_time += curr_wait_time
        curr_wait_time += query
    return min_wait_time
