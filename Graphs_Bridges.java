/**
 * 
 */
package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ashish
 *
 */
class Graphs_Bridges {

	/**
	 * @param args
	 */
	static int []ctime;
	static boolean []visited;
	static int []mtime;
	static int time=1;
	private static void init(int n)
	{
		ctime=new int[n];
		mtime=new int[n];
		visited=new boolean[n];
	}
	
	

	private static void printbridges(int adjvertices, int node)
	{
		System.out.println(""+adjvertices+" "+node);
	}
	
	
	
	
	private static void bridges(ArrayList<Integer>[] graphs, int node, int parent)
	{
		visited[node]=true;
		ctime[node]=time;
		mtime[node]=time;
		time+=1;
		for(int j=0;j<graphs[node].size();j++)
		{
			int adjvertices=graphs[node].get(j);
			if(adjvertices==parent)//connected graph
			{
				continue;
			}
			if(visited[adjvertices]==false)
			{
				bridges(graphs,adjvertices,node);
				mtime[node]=Math.min(mtime[node], mtime[adjvertices]);//compare min time with all its adj vertices
				if(mtime[adjvertices]>ctime[node])//try to break the bridge
				{
					printbridges(adjvertices,node);
					
				}
			}
			else
			{
				mtime[node]=Math.min(mtime[node],ctime[adjvertices]);//first time when a visited node is found
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
			int connections=0;
			for(int k=0;k<connections;k++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				graphs[u].add(v);
				graphs[v].add(u);
			}
			bridges(graphs,1,0);
			
			
		}

	}





}
