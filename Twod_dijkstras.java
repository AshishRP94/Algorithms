package cp_algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Twod_dijkstras
{

	static class pair
	{
		int v;
		int w;
		public pair(int v,int w)
		{
			this.v=v;
			this.w=w;
		}
	}
	
	static class triplets
	{
		int x;
		int y;
		int z;
		public triplets(int x,int y,int z)
		{
			this.x=x;
			this.y=y;
			this.z=z;
		}
	}
	
	private static void find_shortest_distance(ArrayList<pair>[] graphs, HashSet<triplets> fset, int n)
	{
		int [][]distance=new int[graphs.length][graphs.length];
		for(int i=0;i<distance.length;i++)
		{
			for(int j=0;j<distance.length;j++)
			{
				distance[i][j]=Integer.MAX_VALUE;
			}
		}
		distance[0][0]=0;
		Queue<triplets>queue=new LinkedList<>();
		int ldist=0,lnode=0;
		queue.add(new triplets(0,1,1));
		while(true)
		{
			if(queue.size()==0)
			{
				break;
			}
			int dist=queue.peek().x;
			int node=queue.peek().y;
			int pnode=queue.peek().z;
			if(node==n)
			{
				ldist=dist;
				lnode=pnode;
				break;
				
			}
			queue.poll();
//			traverse of adjacent nodes
			for(int i=0;i<graphs[node].size();i++)
			{
				pair temp=graphs[node].get(i);
				int adjv=temp.v;
				int adjvw=temp.w;
				if(dist+adjvw<distance[adjvw][node])
				{
					distance[adjvw][node]=dist+adjvw;
					queue.add(new triplets(adjvw+1,adjv,node));
					
				}
			}
		}
		
		
		ArrayList<Integer>path=new ArrayList<Integer>();
		path.add(n);
		path.add(lnode);
		while(ldist!=0)
		{
			ldist-=1;
			for(int i=1;i<=n;i++)
			{
				if(distance[lnode][i]==ldist)
				{
					lnode=i;
					break;
				}
			}
			path.add(lnode);
			
		}
		
		for(int i=path.size()-1;i>=0;i--)
		{
			System.out.print(" "+path.get(i));
			
		}
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)	
		{
			int nodes=scan.nextInt();
			int edges=scan.nextInt();
			int queries=scan.nextInt();
			ArrayList<pair>[]graphs=new ArrayList[nodes+1];
			for(int j=0;j<graphs.length;j++)
			{
				graphs[j]=new ArrayList<pair>();
			}
			for(int j=0;j<edges;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				int w=scan.nextInt();
				graphs[u].add(new pair(v,w));
			}
			
			HashSet<triplets>fset=new HashSet<triplets>();
			for(int k=0;k<queries;k++)
			{
				int x=scan.nextInt();
				int y=scan.nextInt();
				int z=scan.nextInt();
				
				fset.add(new triplets(x,y,z));
				
			}
			find_shortest_distance(graphs,fset,nodes);
		}

	}


}
