/*
 * BFS traversal
 */
package com.nitin.algo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import com.nitin.algo.GraphUtils.GraphNode;

public class BFS {
	
	public static void main(String[] args) {
		GraphNode root = GraphUtils.createGraph();
		System.out.println("BFS Traversal");
		bfsTraversal(root);
	}

	private static void bfsTraversal(GraphNode root) {
		if(root == null)
			return;
		
		Set<GraphNode> set = new HashSet<>();
		Queue<GraphNode> queue = new LinkedList<>();
		queue.add(root);
		set.add(root);

		while(!queue.isEmpty()) {
			
			GraphNode node = queue.remove();
			System.out.println(node.val);;
			node.visited = true;
			
			if(node.neighbors != null && !node.neighbors.isEmpty()) {
				for(GraphNode neighbor : node.neighbors)
					if(!neighbor.visited && set.add(neighbor)) {
						queue.add(neighbor);
					}
			}
		}
		
	}

}
