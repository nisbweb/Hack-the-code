# THE STRING GALACTICA 

Maeve and Otis are playing a game . The rules of the game are pretty simple. Participants have to say words in turns . You cannot say a word which was already said by the other participant .Maeve starts the game . The participants which can't say a new word loses.

You're given two buckets of words familiar to Maeve and Otis.Your task is to determine if Maeve Wiley wins the game.

Both play the game optimally . By optimally , it means that either participants first chooses the word which is present in others word list.

## Input Format :

The first input line contains two integers n and m   
n- number of words Maeve knows    
m- number of words Otis knows     
Then n strings follow    
After n strings we have m strings    


## Constraints :
```
1 <=  n, m <=  10^3
```

## Output Format :

YES for the victory of Maeve

NO for her loss

## Sample Input :
```
2 2
crewmate
imposter
crewmate
sabotage
```
## Sample Output 0 :
YES