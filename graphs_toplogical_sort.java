package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class graphs_toplogical_sort
{
	static boolean []visited;
	private static void init(int n)
	{
		visited=new boolean[n];
		
	}
	static Stack<Integer>st=new Stack<Integer>();
	private static void dfs(ArrayList<Integer>[] graphs, int nodes) 
	{
		for(int i=0;i<graphs[nodes].size();i++)
		{
			int adjveritces=graphs[nodes].get(i);
			if(visited[adjveritces]==false)
			{
				dfs(graphs,adjveritces);
				
			}
			
		}
		st.push(nodes);
	}
	
	private static void driver(ArrayList<Integer>[] graphs)
	{
		for(int i=1;i<graphs.length;i++)
		{
			if(visited[i]==false)
			{
				dfs(graphs, i);
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
			ArrayList<Integer>[]graphs=new ArrayList[n+1];
			for(int j=0;j<graphs.length;j++)
			{
				graphs[j]=new ArrayList<Integer>();	
			}
			int connections =scan.nextInt();
			for(int j=0;j<connections;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				graphs[u].add(v);
				driver(graphs);
			}
		}
	}







}
