# THE CARD GAME DECOUPLING

Alex and Jessica are playing a game. The rules of the game are that the participants have G cards continuously . Each card has a number written on it, all numbers on the cards are distinct. The participants take turns, Alex takes his move first. In a move a participant can take one card: either the extreme left card, or the extreme right one. The game ends when there are no cards left. The participant whose score is maximum wins tha game. The score of each participant is the sum of cards picked by him/her.

Alex and Jessica are using smart moves every time . They pick the maximum of the 2 options every time.

Justin is a friend of Alex and Jessica. She knows that the participants are smart. Help Justin find the scores of both Alex and Jessica at the end of the game.

## Input Format :

The first line contains t => number of test cases. The first line of each test case contains integer k — the number of cards on the table. The second line of each test case contains space-separated numbers .

## Constraints :

```
	1<=t<=100
	1<=n<=1000
```
Each number in the second line is between 1 and 2000000

## Output Format :

Print 2 space separated integers ,the first integer is alex's score and the second is jessica's score.

## Sample Input :

```
3
1
3
5
5 4 18 9 7
6
10 8 6 9 7 5
```

## Sample Output :

```
3 0
29 14
23 22
```