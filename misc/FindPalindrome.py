def find_palindrome(target_word, words):
    target_word_normalized = target_word.strip().lower()
    length = len(target_word_normalized)
    words_normalized = {w.strip().lower() for w in words}
    return next((word for word in words_normalized if length == len(word) and target_word_normalized == word[::-1]), "")

%time find_palindrome("STOP", ["tosp", "Opst", "opst", "post ", "pots", "posst", "tops\n"])

# expected result: 'pots'
