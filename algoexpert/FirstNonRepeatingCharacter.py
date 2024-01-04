def firstNonRepeatingCharacter(string):
    indexes = [None] * 26 # number of a-z characters
    for idx, char in enumerate(string):
        i = ord(char) - ord ('a')
        indexes[i] = idx if indexes[i] is None else -1
        
    fnrc = -1
    for idx in indexes:
        if idx is not None and idx != -1:
            fnrc = idx if fnrc == -1 else min(fnrc, idx)
    return fnrc


def firstNonRepeatingCharacter(string):
    chars = {} # k - char, v - idx
    for idx, char in enumerate(string):
        if char not in chars:
            chars[char] = idx
        else:
            chars[char] = -1
            
    for idx in chars.values():
        if idx != -1:
            return idx
    return -1


def firstNonRepeatingCharacter(string):
    chars = dict() # k - char, v - idx
    for char in string:
        chars[char] = chars.get(char, 0) + 1

    for idx, char in enumerate(string):
        if chars[char] == 1:
            return idx
    return -1
