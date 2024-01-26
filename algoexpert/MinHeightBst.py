class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = BST(value)
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = BST(value)
            else:
                self.right.insert(value)

# 1. the working solution
def minHeightBst(array):
    start = 0
    end = len(array) - 1
    mid = end // 2
    tree = BST(array[mid])
    minHeightBstHelper(array, tree, start, mid - 1)
    minHeightBstHelper(array, tree, mid + 1, end)
    return tree

def minHeightBstHelper(array, tree, start, end):
    if start > end:
        return
    mid = (start + end) // 2
    tree.insert(array[mid])
    minHeightBstHelper(array, tree, start, mid - 1)
    minHeightBstHelper(array, tree, mid + 1, end)
    return tree


# 2. refactored solution
def minHeightBst(array):
    return minHeightBstHelper(array, None, 0, len(array) - 1)

def minHeightBstHelper(array, tree, start, end):
    if start > end:
        return
    mid = (start + end) // 2
    if tree is None:
        tree = BST(array[mid])
    else:
        tree.insert(array[mid])
    minHeightBstHelper(array, tree, start, mid - 1)
    minHeightBstHelper(array, tree, mid + 1, end)
    return tree


# 3. optimized solution
def minHeightBst(array):
    return minHeightBstHelper(array, 0, len(array) - 1)

def minHeightBstHelper(array, start, end):
    if start > end:
        return None
    mid = (start + end) // 2
    tree = BST(array[mid])
    tree.left = minHeightBstHelper(array, start, mid - 1)
    tree.right = minHeightBstHelper(array, mid + 1, end)
    return tree
