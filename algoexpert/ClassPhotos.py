# O(nlog(n)) time | O(1) space, where n is the number of students
def classPhotos(redShirtHeights, blueShirtHeights):
    redShirtHeights.sort()
    blueShirtHeights.sort()
    
    r_greater_than_b = redShirtHeights[0] > blueShirtHeights[0]
    
    for r, b in zip(redShirtHeights, blueShirtHeights):
        if r == b:
            return False
        elif (r > b) == r_greater_than_b:
            continue
        else:
            return False
            
    return True


# O(nlog(n)) time | O(1) space, where n is the number of students
def classPhotos(redShirtHeights, blueShirtHeights):
    redShirtHeights.sort()
    blueShirtHeights.sort()

    expected = redShirtHeights[0] > blueShirtHeights[0]
    
    for r, b in zip(redShirtHeights, blueShirtHeights):
        if r == b or (r > b) != expected:
            return False
        
    return True
