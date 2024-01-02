# O(n) time | O(n) space
def runLengthEncoding(string):
    count = 0
    prev = string[0]
    encoded = ''

    for i, curr in enumerate(string):
        if curr == prev:
            count += 1
        else:
            encoded = append(encoded, count, prev)
            count = 1
            prev = curr
        if count == 9:
            encoded += ("9" + curr)
            count = 0
        if i == len(string) - 1:
            encoded = append(encoded, count, curr)
    return encoded

def append(string, count, letter):
    if count == 0:
        return string
    return string + (str(count) + letter)


# O(n) time | O(n) space
def runLengthEncoding(string):
    count = 0
    prev = string[0]
    encoded = ''

    for i, curr in enumerate(string):
        if curr == prev:
            count += 1
            if count == 9:
                encoded += ("9" + curr)
                count = 0
        else:
            encoded = append(encoded, count, prev)
            prev = curr
            count = 1
    encoded = append(encoded, count, curr)
    return encoded

def append(string, count, letter):
    if count == 0:
        return string
    return string + (str(count) + letter)
