# O(n*log(n)) time | O(1) space - where n is the number of jobs
DAYS_LIMIT = 7

def optimalFreelancing(jobs):
    result = [0 for _ in range(DAYS_LIMIT)]

    for job in jobs:
        deadline = job["deadline"]
        payment = job["payment"]

        if deadline > DAYS_LIMIT:
            deadline = DAYS_LIMIT
        
        for i in reversed(range(0, deadline)):
            if result[i] < payment:
                temp = result[i]
                result[i] = payment
                payment = temp
            elif result[i] == payment:
                result[i] = payment                
        
    return sum(result)


# O(n*log(n)) time | O(1) space - where n is the number of jobs
DAYS_LIMIT = 7

def optimalFreelancing(jobs):
    best_payments = [0] * DAYS_LIMIT

    for job in jobs:
        deadline = min(job["deadline"], DAYS_LIMIT)
        payment = job["payment"]
        
        for i in reversed(range(deadline)):
            if best_payments[i] < payment:
                best_payments[i], payment = payment, best_payments[i]
        
    return sum(best_payments)
