# Greedy algorithms
A greedy algorithm is any algorithm that follows the problem-solving heuristic of making the locally optimal choice at each stage. I doesn't always produce the most optimal solution.
<br>
## Cutting Boards
In this problem, we have to find a solution to cut the board into pieces with minimum cost to cutting. 
Try it on
[<img alt="HackerRank" src="https://img.shields.io/badge/-Hackerrank-2EC866?style=for-the-badge&logo=HackerRank&logoColor=white" height="22"/>](https://www.hackerrank.com/challenges/board-cutting/problem)
<br><br>
<p align="center" valign="center">
  <img alt="Cuttingboard" src="https://user-images.githubusercontent.com/55190574/122679626-38896880-d209-11eb-84a2-60ca85bb6c9f.gif" width="800"/>
</p>

`mincost=sum(min(Independent pieces it cut * Cost of each cut))` 
To solve this we have to reduce the number of independent pieces for edges with larger cost. So perform cuts on the highest cost edge as early as possible. 
If we encounter several edges having the same cost, we can cut any one of them first. The following process is implemented in [cuttingboards.py](./Greedy/cuttingboards.py)
