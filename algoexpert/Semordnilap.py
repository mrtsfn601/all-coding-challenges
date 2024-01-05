def semordnilap(words):
    visited = set()
    result = []
    for word in words:
        reversed = word[::-1]
        if reversed in visited:
            result.append([word, reversed])
            visited.add(reversed)
        visited.add(word)
    return result
