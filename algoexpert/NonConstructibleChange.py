# O(n log(n)) time | O(1) space
# where n is the number of coins
def nonConstructibleChange(coins):
    coins.sort()
    curr_change = 0
    
    for coin in coins:
        if coin > curr_change + 1:
            break
            
        curr_change += coin
        
    return curr_change + 1
