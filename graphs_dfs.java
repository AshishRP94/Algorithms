package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class graphs_dfs
{
	
	
	static boolean[]visited;
	

	private static void init(int n)
	{
		visited=new boolean[n];
	}
	
	private static void graph_dfs(ArrayList<Integer>[] graphs, int node)
	{
		
		for(int i=0;i<graphs[node].size();i++)
		{
			int adjnodes=graphs[node].get(i);
			if(visited[adjnodes]==true)
			{
				
			}
			else
			{
				graph_dfs(graphs, adjnodes);
			}
			visited[adjnodes]=true;
			
		}
		
		
	}
	
	private static void driver(ArrayList<Integer>[] graphs)
	{
		for(int i=1;i<graphs.length;i++)
		{
			if(visited[i]==false)
			{
				graph_dfs(graphs, i);
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
			
			int connection=scan.nextInt();
			for(int j=0;j<connection;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				graphs[u].add(v);
			}
			driver(graphs);

			
			
		}

	}






}
