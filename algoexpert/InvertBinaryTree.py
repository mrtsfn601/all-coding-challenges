# This is the class of the input binary tree.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


# O(n) time | O(1) space
def invertBinaryTree(tree):
    if tree is None:
        return
    tree.left, tree.right = tree.right, tree.left
    invertBinaryTree(tree.left)
    invertBinaryTree(tree.right)


# O(n) time | O(1) space
def invertBinaryTree(tree):
    if tree is not None:
        tree.left, tree.right = invertBinaryTree(tree.right), invertBinaryTree(tree.left)
    return tree
