def numberOfWaysToMakeChange(n, denoms):
    waysToMakeChange = [1] + [0 for _ in range(n)]
    for denom in denoms:
        for change in range(denom, n+1):
            waysToMakeChange[change] += waysToMakeChange[change-denom]
    return waysToMakeChange[-1]
