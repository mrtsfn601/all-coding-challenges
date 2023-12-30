# O(n) time | O(n) space
def isPalindrome(string):
    return string == string[::-1]


# O(n) time | O(n) space
def isPalindrome(string):
    return string == "".join(reversed(string))


# O(n) time | O(1) space
def isPalindrome(string):
    left = 0
    right = len(string) - 1
    while left < right:
        if string[left] != string[right]:
            return False
        left += 1
        right -= 1
    return True
