# O(n) time | O(n) space
# where n is the number of nodes in binary tree
def nodeDepths(root, depths = 0, sum = 0):
    if root.left is not None:
        sum = nodeDepths(root.left, depths + 1, sum + depths + 1)
    if root.right is not None:
        sum = nodeDepths(root.right, depths + 1, sum + depths + 1)
    return sum


# O(n) time | O(n) space
# where n is the number of nodes in binary tree
def nodeDepths(root, depths = 0):
    if root is None:
        return 0
    return depths + nodeDepths(root.left, depths + 1) + nodeDepths(root.right, depths + 1)


# This is the class of the input binary tree.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
