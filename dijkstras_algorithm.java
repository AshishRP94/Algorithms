package cp_algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class dijkstras_algorithm
{
	
	static boolean []visited; 
	private static void init(int n)
	{
		visited=new boolean[n];
	}
	
	static class pair
	{
		int distance=0;
		int node=0;
		public pair(int distance,int node)
		{
			this.distance=distance;
			this.node=node;
		}
	}
	
	private static void bfs(ArrayList<pair>[] graphs, int node)
	{
		int[] distance=new int[graphs.length];
		for(int i=0;i<distance.length;i++)
		{
			distance[i]=Integer.MAX_VALUE;
		}
		
		Queue<pair>qu=new LinkedList<pair>();
		qu.add(new pair(0,node));
		
		while(true)
		{
			if(qu.size()==0)
			{
				break;
			}
			pair p=qu.poll();
			for(int i=0;i<graphs[p.node].size();i++)
			{
				pair adjv=graphs[p.node].get(i);
				if(visited[adjv.node]==false)
				{
					if(adjv.distance+p.distance<distance[adjv.node])
					{
						distance[adjv.node]=adjv.distance+p.distance;
						qu.add(new pair(distance[adjv.node],adjv.node));
					}
					visited[adjv.node]=true;
				}
				
				
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
			ArrayList<pair>[]graphs=new ArrayList[n];
			for(int j=0;j<graphs.length;j++)
			{
				graphs[j]=new ArrayList<pair>();
			}
			int connections=0;
			for(int k=0;k<connections;k++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				int w=scan.nextInt();
				graphs[u].add(new pair(v,w));
			}
			bfs(graphs,1);
			
		}

	}






}
