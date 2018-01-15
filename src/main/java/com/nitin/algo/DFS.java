/*
 * DFS traversal
 */
package com.nitin.algo;

import com.nitin.algo.GraphUtils.GraphNode;

public class DFS {
	
	public static void main(String[] args) {
		GraphNode root = GraphUtils.createGraph();
		System.out.println("DFS Traversal");
		dfsTraversal(root);
	}

	private static void dfsTraversal(GraphNode node, int i) {
        // Mark the current node as visited and print it
        node.visited = true;
        System.out.println(node.val);
 
        // Recur for all the vertices adjacent to this vertex
        if(node.neighbors != null && !node.neighbors.isEmpty()) {
			for(GraphNode neighbor : node.neighbors)
				if(!neighbor.visited) {
					dfsTraversal(neighbor, i);
				}
        }
    }
 
    // The function to do DFS traversal. It uses recursive DFSUtil()
    private static void dfsTraversal(GraphNode root) {
    		// Call the recursive helper function to print DFS traversal
        dfsTraversal(root, 5);
    }

}
