# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


# O(n) time | O(h) space
# where n is the number of nodes in a Binary Tree
# where h is the height of a Binary Tree        
def evaluateExpressionTree(tree):
    if tree.value > 0: return tree.value
    
    sign = tree.value
    leftVal = evaluateExpressionTree(tree.left)
    rightVal = evaluateExpressionTree(tree.right)

    if sign == -1: return leftVal + rightVal
    if sign == -2: return leftVal - rightVal
    if sign == -3: return int(leftVal / rightVal)
    if sign == -4: return leftVal * rightVal
    
    return -1
