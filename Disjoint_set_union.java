package cp_algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Disjoint_set_union {
	
	static int []parent;
	static int []size;
	private static void init()
	{
		parent=new int[100000];
		size=new int[100000];
		for(int i=0;i<parent.length;i++)
		{
			parent[i]=i;
			size[i]=1;
		}
	}
	
	
	private static int findparent(int node)
	{
		if(parent[node]==node)
		{
			return node;
		}
		
		return parent[node]=findparent(parent[node]);
	}
	
	
	
	private static void union(int u, int v)
	{
		int paru=findparent(u);
		int parv=findparent(v);
		
		if(size[paru]<size[parv])
		{
			parent[parv]=paru;
			size[parv]+=size[paru];
		}
		else
		{
			parent[paru]=parv;
			size[paru]+=size[parv];
		}
		
	}
	
	


	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		init();
		for(int i=0;i<t;i++)
		{
			int queries=scan.nextInt();
			for(int j=0;j<queries;j++)
			{
				
			int type=scan.nextInt();
			int u=scan.nextInt();
			int v=scan.nextInt();
			if(type==1)
			{
				union(u,v);
			}
			else
			{
				if(findparent(u)==findparent(v))
				{
					System.out.println("belongs to the same component");
				}
				else
				{
					System.out.println("does not belongs to the same component");
					
				}
			}
			}
			
		}
	}







}
