# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


def binaryTreeDiameter(tree):
    return getTreeInfo(tree).diameter


def getTreeInfo(tree):
    if tree is None:
        return TreeInfo(0, 0)

    left = getTreeInfo(tree.left)
    right = getTreeInfo(tree.right)
    
    maxDiameter = max(left.diameter, right.diameter)
    currDiameter = left.height + right.height
    
    return TreeInfo(max(maxDiameter, currDiameter), 1 + max(left.height, right.height))


class TreeInfo:
    def __init__(self, diameter, height):
        self.diameter = diameter
        self.height = height
