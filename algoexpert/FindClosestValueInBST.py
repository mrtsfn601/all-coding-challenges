def findClosestValueInBst(tree, target):
    return findClosestValueInBstRecursive(tree, target, closest = tree.value)

def findClosestValueInBstRecursive(tree, target, closest):
    if tree is None:
        return closest
    if abs(tree.value - target) < abs(closest - target):
        closest = tree.value
    if tree.left is not None:
        closest = findClosestValueInBstRecursive(tree.left, target, closest)
    if tree.right is not None:
        closest = findClosestValueInBstRecursive(tree.right, target, closest)    
    return closest


# Average: O(log(n)) time | O(log(n)) space
# Average: O(n) time | O(n) space
def findClosestValueInBst(tree, target):
    return findClosestValueInBstRecursive(tree, target, closest = tree.value)

def findClosestValueInBstRecursive(tree, target, closest):
    if tree is None:
        return closest
    
    if abs(tree.value - target) < abs(closest - target):
        closest = tree.value
    
    if target < tree.value:
        return findClosestValueInBstRecursive(tree.left, target, closest)
    
    if target > tree.value:
        return findClosestValueInBstRecursive(tree.right, target, closest)    
    
    return closest


# This is the class of the input tree. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
