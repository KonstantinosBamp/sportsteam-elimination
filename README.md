# sportsteam-elimination
Application of the Ford-Fulkerson Algorithm to solve the Sportsteam Elimination Problem

## The Max Flow Problem

We use a directed graph $G = (V,E)$ to model some sort of transportation network. The edges carry some sort of *traffic* and the vertices act as *passing points* between the edges. We have a designated starting and ending point, the *sink* and *source* vertices, typically denoted by $s$ and $t$, respectively. Each edge has some capacity $u_{e}$ denoting the maximum amount of traffic it can carry. By flow, formally we mean a function that assigns to each edge a non-negative real number, $f: E \rightarrow \mathbf{R}^{+}$, while at the same time respecting the capacity constraints. We also assume that for all vertices $v  \neq s,t  \in V$, the amount of flow entering $v$ is equal to the amount of flow leaving $v$. Our goal is to push as much flow as possible from $s$ to $t$, subject to the constraints. 
 
### The Algorithm
## Elimination

### Disclaimer - Modification to the Scoring System

The “baseball elimination problem” is defined as follows; There are some remaining games and there are some games that have already been played. The goal is to determine whether a given team has been eliminated. Football uses a $3$-Point Rule, meaning that the winner gets $3$ points, the loser $0$ and if there is a draw, each team gets one point. It has been proved by various authors that the elimination problem under this rule is $\mathbb{NP}-$Complete. Because I prefer football to baseball, I *change* the scoring system so that a win leads to one point and a loss to zero (and there is a simple trick to deal with draws). Obviously, the results will not be indicative for determining whether any football has been eliminated and this is a *for-fun* project.


## References:
1. Kleinberg, J., & Tardos, É. (2014). Algorithm design (Pearson new international edition). Pearson.
2. Roughgarden T. (2016). CS261: A Second Course in Algorithms, Lecture #1: Course Goals and Introduction to Maximum Flow. Stanford University 
3. Noble S. (2023). Combinatorial Optimization, Lecture Notes. Birkbeck, University of London
4. Kern W., & Paulusma D. (2004). The Computational Complexity of the Elimination Problem in Generalized Sports Competitions. Discrete Optimization, Volume 1, Issue 2, Pages 205-214,
ISSN 1572-5286, https://doi.org/10.1016/j.disopt.2003.12.003.
5. Bernholt T., Gulich A., Hofmeister T., & Schmitt N. (1999). Football Elimination is Hard to Decide Under the 3-Point-Rule. Mathematical Foundations of Computer Science 1999, Pages 410-418. 
6. Geeks for Geeks and Princeton Algorithms Part II, Coursera
