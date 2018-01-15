/*
 * Create an undirected graph and traverse it
 */

package com.nitin.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class GraphUtils {
	
	static class GraphNode{ 
		int val;
		List<GraphNode> neighbors;
		boolean visited;
	 
		GraphNode(int x) {
			val = x;
		}
	 
		GraphNode(int x, GraphNode[] n){
			val = x;
		}
	 
		public String toString(){
			return "value: "+ this.val; 
		}
	}
	
	public static GraphNode createGraph() {
		GraphNode n1 = new GraphNode(1); 
		GraphNode n2 = new GraphNode(2); 
		GraphNode n3 = new GraphNode(3); 
		GraphNode n4 = new GraphNode(4); 
		GraphNode n5 = new GraphNode(5); 
 
		n1.neighbors = new ArrayList<GraphNode>(Arrays.asList(n2,n3,n5));
		n2.neighbors = new ArrayList<GraphNode>(Arrays.asList(n1,n4));
		n3.neighbors = new ArrayList<GraphNode>(Arrays.asList(n1,n4,n5));
		n4.neighbors = new ArrayList<GraphNode>(Arrays.asList(n2,n3,n5));
		n5.neighbors = new ArrayList<GraphNode>(Arrays.asList(n1,n3,n4));
		
		return n1;
	}
	
	public static void main(String[] args) {
		GraphNode root = createGraph();
		System.out.println("BFS Traversal");
		bfsTraversal(root);
	}
	
	

	public static void bfsTraversal(GraphNode root) {
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
