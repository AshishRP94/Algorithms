package cp_algorithms;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class krushals
{
	static class trio implements Comparable<trio>
	{
		int w=0;
		int u=0;
		int v=0;
		public trio(int w,int u,int v)
		{
			this.w=w;
			this.u=u;
			this.v=v;
		}
		
		 public int compareTo(trio o) {
		        return w - o.w;
		    }
		
	}
	
	static class pair
	{
		int x=0;
		int y=0;
		public pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
	}
	
	static int []parents;
	static int []size;
	private static void init(int n)
	{
		parents=new int[(n+1)];
		size=new int[(n+1)];
		for(int i=1;i<parents.length;i++)
		{
			parents[i]=i;
			size[i]=1;
		}
	}
	
	
	private static int findparent(int nodes)
	{
		if(parents[nodes]==nodes)
		{
			return nodes;
			
		}
		
		
		return parents[nodes]=findparent(parents[nodes]);
	}
	
	
	private static void union(int u, int v)
	{
		int paru=findparent(u);
		int parv=findparent(v);
		if(size[paru]<size[parv])
		{
			parents[parv]=paru;
			size[parv]+=size[paru];
		}
		else
		{
			parents[paru]=parv;
			size[paru]+=size[parv];
		}
	}
	
	
	

	
	
	private static void mst(PriorityQueue<trio> pq)
	{
		ArrayList<Integer>[]mst=new ArrayList[pq.size()];
		int len=pq.size();
		init(pq.size());
		long sum=0;
		for(int i=0;i<len;i++)
		{
			trio temp=pq.poll();
			int w=temp.w;
			int u=temp.u;
			int v=temp.v;
			if(findparent(u)!=findparent(v))
			{
				union(u,v);
				sum+=w;
				mst[u].add(v);
			}
		}
		
		System.out.println(""+sum);
	}
	
	









	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int edges=scan.nextInt();
	        PriorityQueue<trio> pq = new PriorityQueue<trio>(); 

			for(int j=0;j<edges;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				int w=scan.nextInt();
				pq.add(new trio(w,u,v));
			}
			mst(pq);
		}

	}



}
