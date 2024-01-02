def commonCharacters(strings):
    result = set(strings[0])
    for s in strings[1:]:
        curr = result.copy()
        for c in result:
            if c not in s:
                curr.remove(c)
        result = curr
    return result


def commonCharacters(strings):
    result = set(strings[0])
    for s in strings[1:]:
        result = set.intersection(result, s)
        # result &= set(s)
    return result


def commonCharacters(strings):
    return set.intersection(*[set(s) for s in strings])
