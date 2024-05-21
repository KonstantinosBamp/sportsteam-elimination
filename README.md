# sportsteam-elimination
Application of the Ford-Fulkerson Algorithm to solve the Sportsteam Elimination Problem

## Part 1: The Max Flow Problem

We use a directed graph $G = (V,E)$ to model some sort of transportation network. The edges carry some sort of *traffic* and the vertices act as *passing points* between the edges. We have a designated starting and ending point, the *sink* and *source* vertices, typically denoted by $s$ and $t$, respectively. Each edge has some capacity $u_{e}$ denoting the maximum amount of traffic it can carry. By flow, formally we mean a function that assigns to each edge a non-negative real number, $f: E \rightarrow \mathbf{R}^{+}$, while at the same time respecting the capacity constraints. We also assume that for all vertices $v  \neq s,t  \in V$, the amount of flow entering $v$ is equal to the amount of flow leaving $v$. Our goal is to push as much flow as possible from $s$ to $t$, subject to the constraints. 

### The Algorithm
The naive approach involves starting with $f(e)=0$, $\forall e \in E$. Search for $s-t$ paths with spare capacity and greedily push as much flow as possible in that path, until no other path can be found.
~~~
for e in E:
   f(e) = 0
repeat:
   search for s-t path P with spare capacity
   if no path is found:
     return current flow
  else:
     let D the maximum possible flow that can be sent via P
     for e in P:
       f(e)+D
~~~
This approach does not produce the maximum flow at all times. Once a "decision" to send flow has been made, it is final, regardless of whether it is optimal. Instead, we allow *reverse* operations when sending flow. 


~~~

for e in E:
   f(e) = 0
repeat:
   search for s-t path P with spare capacity in the residual graph
   if no path is found:
     return current flow
  else:
     let D the maximum possible flow that can be sent via P
     for forward e in P:
       f(e)+D
     for backward e in P:
       f(e)-D
~~~

## Part 2: Sportsteam Elimination

The “baseball (or sportsteam) elimination problem” is defined as follows; There are some remaining games and there are some games that have already been played. The goal is to determine whether a given team has been eliminated from the league.

### Disclaimer - Modification to the Scoring System



## References:
1. Kleinberg, J., & Tardos, É. (2014). Algorithm design (Pearson new international edition). Pearson.
2. Roughgarden T. (2016). CS261: A Second Course in Algorithms, Lecture #1: Course Goals and Introduction to Maximum Flow. Stanford University 
3. Noble S. (2023). Combinatorial Optimization, Lecture Notes. Birkbeck, University of London
4. Kern W., & Paulusma D. (2004). The Computational Complexity of the Elimination Problem in Generalized Sports Competitions. Discrete Optimization, Volume 1, Issue 2, Pages 205-214,
ISSN 1572-5286, https://doi.org/10.1016/j.disopt.2003.12.003.
5. Bernholt T., Gulich A., Hofmeister T., & Schmitt N. (1999). Football Elimination is Hard to Decide Under the 3-Point-Rule. Mathematical Foundations of Computer Science 1999, Pages 410-418. 
6. Geeks for Geeks and Princeton Algorithms Part II, Coursera
