package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class detect_cycle_dirtected_graph {
	
	static boolean[]pvisited;
	static boolean[]tvisited;
	private static void init(int n)
	{
		pvisited=new boolean[n];
		tvisited=new boolean[n];
	
	}
	
	private static boolean detect_cycle(ArrayList<Integer>[] graphs, int nodes)
	{
		pvisited[nodes]=true;
		tvisited[nodes]=true;
	
		for(int i=0;i<graphs[nodes].size();i++)
		{
			int adjvertices=graphs[nodes].get(i);
			if(pvisited[adjvertices]==false)
			{
				if(detect_cycle(graphs,adjvertices)==true)
				{
					return true;
				}
			}
			else if(tvisited[adjvertices]==true)
			{
				return true;
				
			}
		}
		tvisited[nodes]=false;
		return false;
		
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
				detect_cycle(graphs,1);
			}
		}

	}






}
