# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


def mergeBinaryTrees(tree1, tree2):
    return mergeBinaryTreesHelper(tree1, tree2, None)

def mergeBinaryTreesHelper(tree1, tree2, mergeTree):
    if tree1 is None:
        return tree2
    if tree2 is None:
        return tree1
    mergeTree = BinaryTree(tree1.value + tree2.value)
    mergeTree.left = mergeBinaryTreesHelper(tree1.left, tree2.left, mergeTree.left)
    mergeTree.right = mergeBinaryTreesHelper(tree1.right, tree2.right, mergeTree.right)
    return mergeTree


# O(min(n,m)) time | O(min(n,m)) space
def mergeBinaryTrees(tree1, tree2):
    if tree1 and tree2:
        mergeTree = BinaryTree(tree1.value + tree2.value)
        mergeTree.left = mergeBinaryTreesHelper(tree1.left, tree2.left, mergeTree.left)
        mergeTree.right = mergeBinaryTreesHelper(tree1.right, tree2.right, mergeTree.right)
        return mergeTree
    return mergeTree
