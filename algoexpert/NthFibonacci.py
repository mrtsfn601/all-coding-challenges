# first "brute force" solution
def getNthFib(n):
    count = 1
    a = 0
    b = 1
    
    if n == count:
        return a
    count += 1
    
    if n == count:
        return b
    count += 1
    
    return getNthFibHelper(n, count, b, a + b)

def getNthFibHelper(n, count, a, b):
    if n == count:
        return b;
    count += 1
    return getNthFibHelper(n, count, b, a + b)


# second optimized recursive solution
def getNthFib(n, count = 1, a = 0, b = 1):    
    return a if n == count else getNthFib(n, count + 1, b, a + b)
