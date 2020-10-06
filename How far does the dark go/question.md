# HOW FAR DOES THE DARK GO :

The world is insane.

You are on a mission .You need to spread a rumour among the city which will help the city blossom when the dark is upon them.

There are n people in city. Some people are friends with each other, and they share the information they receive . You need to pay off the people so the rumour can start rolling out in the city .

i-th person wants Ci euros in exchange for spreading the rumor. When a person hears the rumor, he tells it to all his friends, and then again the friends again start spreading the rumor to their friends (for free), and so on and on .

The quest is finished when all n people know the rumor. What is the minimum amount of euros you needs to spend in order to finish the quest?

## Input Format:

The first line contains two integer numbers n and m — the number of people in the city and the number of pairs of friends.

The second line contains n integer numbers each number represents the amount of euros i-th person is to be bribed to ask him to start spreading the rumor.

Next m lines follow, each containing a pair of numbers (xi, yi) . Each pair represents that they are friends .

## Constraints :
```
1 <= n <= 10^5

0 <= m <= 10^5

0 <= ci <= 10^9

1 <= xi, yi <= n, xi != yi
```

## Output Format :

Print one number — the minimum number of euros you need to spend in order to successfully finish your mission.

## Sample Input :
```
6 3
5 6 4 8 3 2
1 3
3 5
2 6
```

## Sample Output :

13