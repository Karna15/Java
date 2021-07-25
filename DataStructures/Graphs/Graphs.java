package DataStructures.Graphs;

import java.util.Arrays;

/*
 *  Graph DS
 *  --------------
 *  Graph is set of vertices and edges
 *  
 *  -- Types
 *  1. Directed Graph - both nodes are connected either by both direction or in single direction
 *  2. Undirected Graph - both nodes are always connected in both direction
 *  3. Cyclic Graph - Node can travel to another nodes and can come back to its original position
 *  4. Acyclic Graph - Node can travel to another nodes, but cannot able to come back to its original position
 *  5. Weighted Graph - All edges of the nodes have values in it.
 *  6. UnWeighted Graph - Edges does not have values in it.
 *  
 *  -- Note 
 *  1. All Undirected graphs are cyclic graphs
 *  2. We can combine these 3 combination of graphs to create a new graph.
 *  
 *  -- Use case
 *  1. Shortest Path Algorithm
 */

public class Graphs {
	
	public static void main(String[] args) {
		
		Integer[][] graph = {{0, 1, 0, 1}, 
							 {1, 0, 1, 0}, 
							 {0, 1, 0, 1}, 
							 {1, 0, 1, 0}};
		
		System.out.println(Arrays.deepToString(graph));
		
	}
}
