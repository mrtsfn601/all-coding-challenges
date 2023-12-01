def find_anagrams(word, words):
    word_normalized = sorted(word.strip().lower())
    length = len(word_normalized)
    words_normalized = {w.strip().lower() for w in words}
    return sorted({word for word in words_normalized if length == len(word) and word_normalized == sorted(word)})

%time find_anagrams("stop", ["tosp", "Opst", "opst", "post ", "posst", "tops\n"])

# expected result: ['opst', 'post', 'tops', 'tosp']
