# O(n) time | O(n) space
def tournamentWinner(competitions, results):
    winners = dict()
    max_winner = ""
    max_points = 0
    
    for i in range(len(results)):

        if results[i] == 1:
            curr_winner = competitions[i][0] # homeTeam
        else:
            currWinner = competitions[i][1] # awayTeam

        if currWinner in winners:
            currPoints = winners[currWinner] + 3
        else:
            currPoints = 3       
        winners[currWinner] = currPoints

        if maxPoints < currPoints:
            maxPoints = currPoints
            maxWinner = currWinner
    
    return maxWinner

# O(n) time | O(n) space
def tournamentWinner(competitions, results):
    winners = dict()
    max_winner = ""
    max_points = 0
    
    for i in range(len(results)):
        home_team, away_team = competitions[i]
        
        curr_winner = competitions[i][0]
        if results[i] == 0:
            curr_winner = competitions[i][1]

        curr_points = 3
        if curr_winner in winners:
            curr_points += winners[curr_winner]
        winners[curr_winner] = curr_points

        if max_points < curr_points:
            max_winner, max_points = curr_winner, curr_points
    
    return max_winner

# O(n) time | O(n) space
def tournamentWinner(competitions, results):
    winners = dict()
    max_winner, max_points = "", 0
    
    for i in range(len(results)):
        home_team, away_team = competitions[i]
        
        curr_winner = home_team if results[i] == 1 else away_team
        curr_points = 3 + winners.get(curr_winner, 0)
        winners[curr_winner] = curr_points

        if max_points < curr_points:
            max_winner, max_points = curr_winner, curr_points
    
    return max_winner
