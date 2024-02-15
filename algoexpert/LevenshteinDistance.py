def levenshteinDistance(str1, str2):
    # Initialize a 2D list (matrix) to store the distances
    # The size is (len(str1) + 1) x (len(str2) + 1)
    # The '+1' is for the base case of an empty string
    distances = [[j for j in range(len(str2) + 1)] for i in range(len(str1) + 1)]
    
    # Initialize the first column of each row
    for i in range(1, len(str1) + 1):
        distances[i][0] = i
    
    # Fill in the distances matrix
    for i in range(1, len(str1) + 1):
        for j in range(1, len(str2) + 1):
            # If the characters are the same, the cost is 0 (no edit needed)
            # Otherwise, the cost is 1 (a substitution edit)
            if str1[i - 1] == str2[j - 1]:
                cost = 0
            else:
                cost = 1
            
            # Calculate the minimum cost of the three possible edits:
            # insertion, deletion, or substitution
            distances[i][j] = min(distances[i - 1][j] + 1,      # Deletion
                                  distances[i][j - 1] + 1,      # Insertion
                                  distances[i - 1][j - 1] + cost)  # Substitution
    
    # The distance between str1 and str2 is in the bottom-right corner of the matrix
    return distances[-1][-1]
