# This is an input class. Do not edit.
class BST:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right
  
    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = BST(value)
                return
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = BST(value)
                return
            else:
                self.right.insert(value)
        

def reconstructBst(preOrderTraversalValues):
    tree = BST(preOrderTraversalValues[0])
    for idx in range(1, len(preOrderTraversalValues)):
        tree.insert(preOrderTraversalValues[idx])
    return tree
