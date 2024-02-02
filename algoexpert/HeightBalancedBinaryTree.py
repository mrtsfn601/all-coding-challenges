# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


# solution 1
def heightBalancedBinaryTree(tree):
    res = [True]
    getHeight(tree, res, 0)
    return res[0]

def getHeight(tree, res, currHeight):
    if tree is None:
        return currHeight
    currHeight += 1
    leftHeight = getHeight(tree.left, res, currHeight)
    rightHeight = getHeight(tree.right, res, currHeight)
    if abs(leftHeight - rightHeight) > 1:
        res[0] = False
    return max(leftHeight, rightHeight)


# solution 2
def heightBalancedBinaryTree(tree):
    return helper(tree)[0]

# return (isBalanced, height)
def helper(tree):
    if tree is None:
        return (True, 0)
    leftIsBalanced, leftHeight = helper(tree.left)
    rightIsBalanced, rightHeight = helper(tree.right)
    isBalanced = leftIsBalanced and rightIsBalanced and abs(leftHeight - rightHeight) <= 1
    height = max(leftHeight, rightHeight) + 1
    return (isBalanced, height)
