# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


# O(n) time | O(n) space - where n is the number of nodes in the linked list
def middleNode(linkedList):
    copy = []
    node = linkedList
    while node is not None:
        copy.append(node)
        node = node.next
    mid_idx = len(copy) // 2
    return copy[mid_idx]


# O(n) time | O(log(n)) space - where n is the number of nodes in the linked list
def middleNode(linkedList):
    stack = []
    node = linkedList
    i = 0
    while node is not None:
        stack.append(node)
        i += 1
        node = node.next
        if i % 2 == 0:
            del stack[0]
    return stack[0]


# O(n) time | O(1) space - where n is the number of nodes in the linked list
def middleNode(linkedList):
    node = linkedList
    count = 0
    while node is not None:
        count += 1
        node = node.next
    middle_node = linkedList
    for _ in range(count // 2):
        middle_node = middle_node.next
    return middle_node


# O(n) time | O(1) space - where n is the number of nodes in the linked list
def middleNode(linkedList):
    slow_node = linkedList
    fast_node = linkedList
    while fast_node is not None and fast_node.next is not None:
        slow_node = slow_node.next
        fast_node = fast_node.next.next
    return slow_node
