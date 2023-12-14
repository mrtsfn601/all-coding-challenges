# O(nlo(g)) space | O(1) space, where n is the number of tandem bicycles
def tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest):
    redShirtSpeeds.sort()
    blueShirtSpeeds.sort(reverse=fastest)
    total_speed = 0
    for r,b in zip(redShirtSpeeds, blueShirtSpeeds):
        total_speed += max(r,b)
    return total_speed


# O(nlo(g)) space | O(1) space, where n is the number of tandem bicycles
def tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest):
    redShirtSpeeds.sort()
    blueShirtSpeeds.sort(reverse=fastest)
    return sum(max(r,b) for r,b in zip(redShirtSpeeds, blueShirtSpeeds))
