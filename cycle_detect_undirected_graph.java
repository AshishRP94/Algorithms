package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class cycle_detect_undirected_graph
{
	static boolean []visited;
	private static void init(int n)
	{
		visited=new boolean[n];
	}
	
	private static boolean detect_cycle(ArrayList<Integer>[] graphs, int node, int parent)
	{
		for(int i=0;i<graphs[node].size();i++)
		{
			int adjvertices=graphs[node].get(i);
			if(visited[adjvertices]==false)
			{
				visited[adjvertices]=true;
				if(detect_cycle(graphs,adjvertices,node)==true)
				{
					return true;
					
				}
			}
			else if(adjvertices!=parent)
			{
				return true;
			}
			
		}
		return false;
	}
	
	private static void driver(ArrayList<Integer>[] graphs)
	{
		for(int i=1;i<graphs.length;i++)
		{
			if(visited[i]==false)
			{
				detect_cycle(graphs, i, 0);
			}
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			init(n);
			ArrayList<Integer>[]graphs=new ArrayList[n];
			for(int j=0;j<graphs.length;j++)
			{
				graphs[j]=new ArrayList<Integer>();
			}
			int connections=scan.nextInt();
			for(int j=0;j<connections;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				graphs[u].add(v);
			}
			driver(graphs);
			
		}
	}








}
