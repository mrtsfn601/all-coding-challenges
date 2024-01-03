# O(n+m) time | O(c) space, where
# n is the number of the characters
# m is the length of the document
# c is the number of unique characters in the characters string
def generateDocument(characters, document):
    char_count = {}
    
    for c in characters:
        char_count[c] = char_count.get(c, 0) + 1
        
    for c in document:
        if c not in char_count or char_count[c] == 0:
            return False
        char_count[c] -= 1
    
    return True
