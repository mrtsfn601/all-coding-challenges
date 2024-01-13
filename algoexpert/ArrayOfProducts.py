# O(n^2) time | O(n) space
def arrayOfProducts(array):
    product = [1] * len(array)
    for i in range(len(array)):
        for j in range(len(products)):
            if i != j:
                products[j] *= array[i]
    return products
