# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


# O(n) time | O(h) space
def splitBinaryTree(tree):
    targetSum = getBinaryTreeSum(tree) / 2
    canBeSplit = trySubtrees(tree, targetSum)[1]
    return targetSum if canBeSplit else 0

def trySubtrees(tree, targetSum):
    if tree is None:
        return (0, False)
    leftSum, leftCanBeSplit = trySubtrees(tree.left, targetSum)
    rightSum, rightCanBeSplit = trySubtrees(tree.right, targetSum)
    currTreeSum = tree.value + leftSum + rightSum
    canBeSplit = leftCanBeSplit or rightCanBeSplit or currTreeSum == targetSum
    return (currTreeSum, canBeSplit)

def getBinaryTreeSum(tree):
    if tree is None:
        return 0
    return tree.value + getBinaryTreeSum(tree.left) + getBinaryTreeSum(tree.right)


# O(n) time | O(n) space
def splitBinaryTree(tree):
    sums = set()
    sum = get_sum(tree, sums)
    target_sum = sum / 2
    return target_sum if target_sum in sums else 0

def get_sum(tree, sums):
    if tree is None:
        return 0
    curr_sum = tree.value + get_sum(tree.left, sums) + get_sum(tree.right, sums)
    sums.add(curr_sum)
    return curr_sum
