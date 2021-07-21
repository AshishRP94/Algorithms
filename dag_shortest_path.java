package cp_algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class dag_shortest_path {
	
	
	static boolean []visited; 
	static Stack<Integer>stack=new Stack<Integer>(); 
	
	private static void init(int n)
	{
		visited=new boolean[n];
	}
	
	
	private static void topo(ArrayList<Node>[] graphs, int node)
	{
		
		visited[node]=true;
		for(int i=0;i<graphs[node].size();i++)
		{
			Node  n=graphs[node].get(i);
			if(visited[node]==true)
			{
				topo(graphs, n.v);
			}
		}
		stack.add(node);
	}
	
	static class Node
	{
		int v=0;
		int w=0;
		public Node(int v,int w)
		{
			this.v=v;
			this.w=w;
		}
		
	}
	

	
	private static void bfs(ArrayList<Node>[] graphs, int node, int[] distance)
	{
		// TODO Auto-generated method stub
		
		while(true)
		{
			if(stack.isEmpty()==true)
			{
				break;
			}
			int v=stack.pop();
			for(int i=0;i<graphs[v].size();i++)
			{
				Node n=graphs[v].get(i);
				if((distance[node]+n.w)<distance[n.v])
				{
					distance[n.v]=(distance[node]+n.w);
				}
			}
		}
	}

	
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int e=scan.nextInt();
		ArrayList<Node>[]graphs=new ArrayList[n];
		for(int i=0;i<e;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			int w=scan.nextInt();
			
			graphs[u].add(new Node(v,w));
		}
		init(n);
		int []distance=new int[n];
		for(int i=1;i<distance.length;i++)
		{
			distance[i]=Integer.MAX_VALUE;
		}
		topo(graphs,0);
		init(n);
		bfs(graphs,0,distance);
	}










}
