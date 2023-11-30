# How many combinations of coins can I make to have one dollar?

# loop over all possible counts for each coin (summing up to <= 1$);
# if the total amount is exactly $1, add current counts to "combinations"

combinations = []

for count_100 in range(1+1):
    for count_50 in range(2+1):
        for count_25 in range(4+1):
            for count_10 in range(10+1):
                for count_5 in range(20+1):
                    for count_1 in range(100+1):
                        if 100*count_100 + 50*count_50 + 25*count_25 + 10*count_10 + 5*count_5 + count_1 == 100:
                            combinations.append([count_100, count_50, count_25, count_10, count_5, count_1])
print(combinations)
print(len(combinations))

# =============================================================================================================

# loop over all possible $ amount for each coin (summing up to <= 1$);
# if the total amount is <= $1, add current amounts to "combinations_amounts",
# since we can always make up the difference with pennies

combinations_amounts = []

for amount_100 in range(0, 100+1, 100):
    for amount_50 in range(0, 100+1, 50):
        for amount_25 in range(0, 100+1, 25):
            for amount_10 in range(0, 100+1, 10):
                for amount_5 in range(0, 100+1, 5):
                    total_so_far = amount_100 + amount_50 + amount_25 + amount_10 + amount_5
                    
                    if total_so_far <= 100:
                        combinations_amounts.append([amount_100, amount_50, amount_25, amount_10, amount_5,
                                                     100 - total_so_far])

print(combinations_amounts)
print(len(combinations_amounts))

# =============================================================================================================

# same as above, but now as a function that takes arbitrary total

def find_combinations(total):
    combinations_amounts = []

    for amount_100 in range(0, total+1, 100):
        for amount_50 in range(0, total+1, 50):
            for amount_25 in range(0, total+1, 25):
                for amount_10 in range(0, total+1, 10):
                    for amount_5 in range(0, total+1, 5):
                        total_so_far = amount_100 + amount_50 + amount_25 + amount_10 + amount_5

                        if total_so_far <= total:
                            combinations_amounts.append([amount_100, amount_50, amount_25, amount_10, amount_5,
                                                         total - total_so_far])
    
    return combinations_amounts
