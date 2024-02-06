# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


# O(n) time | O(h) space
def symmetricalTree(tree):
    return symmetricalTreeHelper(tree, tree)

def symmetricalTreeHelper(tree1, tree2):
    if tree1 is None and tree2 is None:
        return True
    if (tree1 is None and tree2 is not None) or (tree1 is not None and tree2 is None):
        return False
    if tree1.value != tree2.value:
        return False
    return symmetricalTreeHelper(tree1.left, tree2.right) and symmetricalTreeHelper(tree1.right, tree2.left)


# O(n) time | O(h) space
def symmetricalTree(tree):
    if tree is None:
        return True
    return symmetricalTreeHelper(tree.left, tree.right)

def symmetricalTreeHelper(left, right):
    if left is not None and right is not None and left.value == right.value:
        return symmetricalTreeHelper(left.left, right.right) and symmetricalTreeHelper(left.right, right.left)
    return left == right
