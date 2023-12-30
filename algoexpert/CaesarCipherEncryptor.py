def caesarCipherEncryptor(string, key):
    start = ord('a')
    end = ord('z')
    letter_count = end - start + 1 
    key = key % letter_count
    decrypted = ''
    
    for c in string:
        shifted = ord(c) + key
        if end < shifted:
            shifted -= letter_count
        decrypted += ''.join(chr(shifted))
    return decrypted


def caesarCipherEncryptor(string, key):
    start = ord('a')
    end = ord('z')
    letter_count = end - start + 1 
    key = key % letter_count
    
    decrypted = [chr((ord(c) + key))
             if ((ord(c) + key) <= end)
             else chr((ord(c) + key - letter_count))
             for c in string]
        
    return ''.join(str(c) for c in decrypted)
