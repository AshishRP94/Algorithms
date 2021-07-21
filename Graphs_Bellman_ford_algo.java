package cp_algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs_Bellman_ford_algo
{
	private static void dfs(ArrayList<Node>[] graphs, int node, int edges, int[] distance)
	{
		for(int i=1;i<node;i++)
		{
			Queue<Node>queue=new LinkedList<>();
			while(true)
			{
				if(queue.isEmpty()==true)
				{
					break;					
				}
				Node n=queue.peek();
				for(int j=0;j<graphs[n.v].size();j++)
				{
					Node temp=graphs[n.v].get(j);
					if(distance[temp.v]>distance[n.v]+n.w)
					{
						distance[temp.v]=distance[n.v]+n.w;
					}
				}
			}
		}
		
		Queue<Node>queue=new LinkedList<>();
		while(true)
		{
			if(queue.isEmpty()==true)
			{
				break;					
			}
			Node n=queue.peek();
			for(int j=0;j<graphs[n.v].size();j++)
			{
				Node temp=graphs[n.v].get(j);
				if(distance[temp.v]>distance[n.v]+n.w)
				{
					System.out.println("contains negative cycle");
				}
			}
		}
		
		for(int i=0;i<distance.length;i++)
		{
			System.out.print(distance[i]+" ");
		}
		
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
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int e=scan.nextInt();
		ArrayList<Node> []graphs=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			graphs[i]=new ArrayList<Node>();
		}
		
		for(int i=0;i<e;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			int w=scan.nextInt();
			graphs[u].add(new Node(v,w));		
		}
		
		int []distance=new int[n];
		for(int i=1;i<distance.length;i++)
		{
			distance[i]=Integer.MAX_VALUE;
		}
		dfs(graphs,0,e,distance);
	}


}
