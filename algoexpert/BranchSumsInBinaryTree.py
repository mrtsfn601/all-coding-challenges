# This is the class of the input root. Do not edit it.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

        
# O(n) time | O(n) space
# where n is the number of nodes in a Binary Tree
def branchSums(root):
    return branchSumsHelper(root, 0, [])

def branchSumsHelper(node, sum, sums):
    if node is None:
        return sums
    sum += node.value
    if node.left is None and node.right is None:
        sums.append(sum)
        return sums
    if node.left is not None:
        branchSumsHelper(node.left, sum, sums)
    if node.right is not None:
        branchSumsHelper(node.right, sum, sums)
    return sums


# O(n) time | O(n) space
# where n is the number of nodes in a Binary Tree
def branchSums(root):
    sums = []
    calculateBranchSums(root, 0, sums)
    return sums

def calculateBranchSums(node, current_sum, sums):
    if node is None:
        return    
    current_sum += node.value
    if node.left is None and node.right is None:
        sums.append(current_sum)
        return
    calculateBranchSums(node.left, current_sum, sums)
    calculateBranchSums(node.right, current_sum, sums)
