# This is an input class. Do not edit.
class BST:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def findKthLargestValueInBst(tree, k):
    result = {"kth_largest": None, "count": 0}
    reverseInOrderTraversal(tree, k, result)
    return result["kth_largest"]

def reverseInOrderTraversal(node, k, result):
    if node is None or result["count"] >= k:
        return
    
    reverseInOrderTraversal(node.right, k, result)
    
    if result["count"] < k:
        result["count"] += 1
        if result["count"] == k:
            result["kth_largest"] = node.value
    
    reverseInOrderTraversal(node.left, k, result)
