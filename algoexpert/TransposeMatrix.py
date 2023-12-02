# O(w*h) time | O(w*h) space
# where w is width and h is height
def transposeMatrix(matrix):
    H = len(matrix)
    W = len(matrix[0])
    transposed = [[0] * H for _ in range(W)]
    for i in range(H):
        for j in range(W):
            transposed[j][i] = matrix[i][j]
    return transposed

# O(w*h) time | O(w*h) space
# where w is width and h is height
def transposeMatrix(matrix):
    transposed = []
    for col in range(len(matrix[0])):
        newRow = []
        for row in range(len(matrix)):
            newRow.append(matrix[row][col])
        transposed.append(newRow)
    return transposed
