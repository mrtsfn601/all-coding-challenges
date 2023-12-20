# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


# O(n) time | O(1) space - where n is the number of nodes
def removeDuplicatesFromLinkedList(linkedList):
    node = linkedList
    
    while node is not None:
        next_node = node.next
        
        while next_node is not None and node.value == next_node.value:
            next_node = next_node.next
        
        node.next = next_node
        node = next_node
        
    return linkedList


# O(n) time | O(1) space - where n is the number of nodes
def removeDuplicatesFromLinkedList(linkedList):
    node = linkedList
    
    while node.next is not None:
        if node.value == node.next.value:
            node.next = node.next.next
        else:
            node = node.next
        
    return linkedList
