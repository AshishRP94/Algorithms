package cp_algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Graphs_articulation_point
{
	static boolean []point;
	private static void dfs(boolean[] visited, int node, ArrayList<Integer>[] graphs, int[] parent, int[] time, int[] mintime,int children)
	{
		
		visited[node]=true;
		children+=1;
		time[node]+=1;
		mintime[node]+=1;
		
		for(int i=0;i<graphs[node].size();i++)
		{
			int adjv=graphs[node].get(i);
			if(visited[adjv]==false)
			{
				parent[adjv]=node;
				dfs(visited, adjv, graphs, parent, time, mintime,children);
				mintime[node]=Math.min(mintime[node], mintime[adjv]);
				
				if(parent[node]==-1 && children>1)
				{
					point[node]=true;
				}
				
				if(mintime[node]>=time[adjv])
				{
					point[node]=true;					
				}
				
			}
			else
			{
				mintime[node]=Math.min(mintime[node], time[adjv]);
				
			}
		}
		
	}

	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int nodes=scan.nextInt();
		int edges=scan.nextInt();
		ArrayList<Integer>[]graphs=new ArrayList[nodes];
		for(int i=0;i<nodes;i++)
		{
			graphs[i]=new ArrayList<Integer>();
		}
		
		for(int i=0;i<edges;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			graphs[u].add(v);
		}
		
		int []parent=new int[nodes];
		point=new boolean[nodes];
		for(int i=0;i<parent.length;i++)
		{
			parent[i]=-1;
		}
		
		boolean []visited=new boolean[nodes];
		int []time=new int[nodes];
		int []mintime=new int[nodes];
		
		for(int i=0;i<nodes;i++)
		{
			if(visited[i]==false)
			{
				dfs(visited,0,graphs,parent,time,mintime,0);
			}
		}
		
		for(int i=0;i<point.length;i++)
		{
			System.out.print(" "+point[i]);
		}
		
		
		
		
		
		
	}


}
