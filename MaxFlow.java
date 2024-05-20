/*
 * implementation of the Ford-Fulkerson Algorithm for Max-Flow program 
 * Note: Ford-Fulkerson uses BFS to search for augmenting paths in the residual graph
 * tester program from GeeksforGeeks that will be modified for the PL Elimination problem 
 */
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.LinkedList;

class MaxFlow {
	static  final int V; 


	boolean bfs(int rGraph[][], int s, int t, int parent[])
	{
		
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; ++i)
			visited[i] = false;

		
		LinkedList<Integer> queue
			= new LinkedList<Integer>();
		queue.add(s);
		visited[s] = true;
		parent[s] = -1;

		// Standard BFS Loop
		while (queue.size() != 0) {
			int u = queue.poll();

			for (int v = 0; v < V; v++) {
				if (visited[v] == false
					&& rGraph[u][v] > 0) {
					// If we find a connection to the sink
					// node, then there is no point in BFS
					// anymore We just have to set its parent
					// and can return true
					if (v == t) {
						parent[v] = u;
						return true;
					}
					queue.add(v);
					parent[v] = u;
					visited[v] = true;
				}
			}
		}


		return false;
	}


	int fordFulkerson(int graph[][], int s, int t)
	{
		int u, v;

		int rGraph[][] = new int[V][V];

		for (u = 0; u < V; u++)
			for (v = 0; v < V; v++)
				rGraph[u][v] = graph[u][v];

		
		int parent[] = new int[V];

		int max_flow = 0; 
		while (bfs(rGraph, s, t, parent)) {
			
			int path_flow = Integer.MAX_VALUE;
			for (v = t; v != s; v = parent[v]) {
				u = parent[v];
				path_flow
					= Math.min(path_flow, rGraph[u][v]);
			}

			
			for (v = t; v != s; v = parent[v]) {
				u = parent[v];
				rGraph[u][v] -= path_flow;
				rGraph[v][u] += path_flow;
			}

			
			max_flow += path_flow;
		}

	
		return max_flow;
	}


}
