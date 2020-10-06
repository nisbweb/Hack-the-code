# THE HEIGHT MAXIMIZATION RECALIBRATION 

Finally,NIE has opened again after long lockdown, so the basketball coach decides to hold a basketball training session. 2⋅n students attend the training session, the coach has decided to line up the students into two rows of size n.Let us number the students from 1 to n in each row from left to right.

The coach wants to pick a playing team for basketball. The coach chooses players from left to right, and the index of each chosen player (excluding the first one taken) should be strictly greater than the index of the previously chosen player to your team. To deny partiality, Coach chooses students in such a way that no consecutive players chosen belong to the same row. The first student can be chosen among any student from the given 2n students , and a team can consist of any number of students.

According to the coach in order to build a perfect winning team, he must select students in such a way, that the sum of heights of all selected students is maximum possible. You need to help your coach to find the maximum possible total height of players in a team he can choose and win the upcoming tournament.

## Input Format :

The first line of the input contains a single integer n (1≤n≤105) — the number of students in each row.

The second line of the input contains n integers : height of students in the first row.

The third line of the input contains n integers : height of students in the second row.

## Constraints :
```
1<=n<=10^5
```

## Output Format :

Print a single integer which represents the max height possible for the team

## Sample Input :
```
5
9 3 5 7 3
5 8 1 4 5
```

## Sample Output :

29