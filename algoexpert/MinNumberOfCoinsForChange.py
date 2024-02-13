def minNumberOfCoinsForChange(n, denoms):
    # Initialize an array to store the minimum number of coins needed for each amount up to n
    numCoins = [float("inf")] * (n + 1)
    # There are 0 ways to make change for 0
    numCoins[0] = 0
    
    # For each denomination, update the numCoins array with the minimum coins needed
    for denom in denoms:
        for amount in range(len(numCoins)):
            if denom <= amount:
                # Update if using the current denomination results in fewer coins
                numCoins[amount] = min(numCoins[amount], 1 + numCoins[amount - denom])

    # Return the result for n, or -1 if it's not possible to make change
    return numCoins[n] if numCoins[n] != float("inf") else -1
