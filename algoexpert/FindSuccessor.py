# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None, parent=None):
        self.value = value
        self.left = left
        self.right = right
        self.parent = parent


# O(n) time | O(n) space
def findSuccessor(tree, node):
    nodes = inOrderTraverSal(tree, [])
    return findSuccessorHelper(nodes, node)

def inOrderTraverSal(tree, nodes = []):
    if tree is None:
        return nodes
    inOrderTraverSal(tree.left, nodes)
    nodes.append(tree)
    inOrderTraverSal(tree.right, nodes)
    return nodes

def findSuccessorHelper(nodes, node):
    for i in range(len(nodes)):
        if nodes[i].value != node.value:
            continue
        if i == len(nodes) - 1:
            return None
        return nodes[i + 1]


# O(h) time | O(1) space
def findSuccessor(tree, node):
    # get leftmost child
    if node.right is not None:
        successor = node.right
        while successor.left is not None:
            successor = successor.left
        return successor
    # get rightmost child
    if node.parent is None:
        return None
    if node == node.parent.left:
        return node.parent
    return node.parent.parent
